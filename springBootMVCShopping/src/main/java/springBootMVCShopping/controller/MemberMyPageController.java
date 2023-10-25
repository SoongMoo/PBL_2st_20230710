package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.service.memberMyPage.MemberInfoService;
import springBootMVCShopping.service.memberMyPage.MemberPwModifyService;
import springBootMVCShopping.service.memberMyPage.MyPassConfirmService;

@Controller
@RequestMapping("mypage")
public class MemberMyPageController {
	@Autowired
	MemberInfoService memberInfoService;
	@Autowired
	MemberPwModifyService memberPwModifyService;
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
	@Autowired
	MyPassConfirmService myPassConfirmService;
	@PostMapping("myPwUpdate")
	@ResponseBody
	public  boolean myPwUpdate(
			@RequestParam("oldPw") String oldPw,
			@RequestParam("newPw") String newPw,
			HttpSession session) {
		return myPassConfirmService.execute(newPw, oldPw, session);
	}
}
