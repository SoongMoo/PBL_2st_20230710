package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.service.memberMyPage.MemberDropService;
import springBootMVCShopping.service.memberMyPage.MemberInfoService;
import springBootMVCShopping.service.memberMyPage.MemberInfoUpdateService;
import springBootMVCShopping.service.memberMyPage.MemberPwModifyService;
import springBootMVCShopping.service.memberMyPage.MyPassConfirmService;

@Controller
@RequestMapping("mypage")
public class MemberMyPageController {
	@Autowired
	MemberInfoService memberInfoService;
	@Autowired
	MemberPwModifyService memberPwModifyService;
	@Autowired
	MemberDropService memberDropService;
	@Autowired
	MyPassConfirmService myPassConfirmService;
	
	@GetMapping("memberUpdate")
	public String memberUpdate(HttpSession session, Model model) {
		memberInfoService.execute(session, model);
		return "thymeleaf/memberShip/myModify";
	}
	@Autowired
	MemberInfoUpdateService memberInfoUpdateService;
	@PostMapping("memberUpdate")
	public String memberUpdate(@Validated MemberCommand memberCommand , 
			BindingResult result ,HttpSession session) {
		memberInfoUpdateService.execute(memberCommand, session, result);
		if(result.hasErrors()) {
			return "thymeleaf/memberShip/myModify";
		}
		return "redirect:myDetail";
	}
	@GetMapping("memberDrop")
	public String memberDrop() {
		return "thymeleaf/memberShip/memberDrop";
	}
	@PostMapping("memberDropOk")
	public String memberDrop(
			@RequestParam("memberPw") String memberPw, Model model,
			HttpSession session) {
		int i = memberDropService.execute(memberPw, session, model);
		if(i == 1) {
			return "thymeleaf/memberShip/memberDrop";
		}else {
			return "thymeleaf/memberShip/memberDrop";
		}
	}
	
	@RequestMapping("myDetail")
	public String myDetail(HttpSession session, Model model) {
		memberInfoService.execute(session, model);
		return "thymeleaf/memberShip/myInfo";
	}
	@RequestMapping(value="userPwModify", method = RequestMethod.GET)
	public String userPwModify() {
		return "thymeleaf/memberShip/myPwCon";
	}
	@RequestMapping(value="memberPwModify", method = RequestMethod.POST )
	public String userPwModify(
			@RequestParam("memberPw") String memberPw, Model model,
			HttpSession session) {
		return memberPwModifyService.execute(session, model, memberPw);
	}

	@PostMapping("myPwUpdate")
	@ResponseBody
	public  boolean myPwUpdate(
			@RequestParam("oldPw") String oldPw,
			@RequestParam(value="newPw") String newPw,
			HttpSession session) {
		return myPassConfirmService.execute(newPw, oldPw, session);
	}
}
