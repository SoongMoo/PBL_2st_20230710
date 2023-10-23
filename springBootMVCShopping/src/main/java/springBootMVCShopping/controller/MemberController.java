package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.service.member.MemberAutoNumService;
import springBootMVCShopping.service.member.MemberDeleteService;
import springBootMVCShopping.service.member.MemberDetailService;
import springBootMVCShopping.service.member.MemberInsertService;
import springBootMVCShopping.service.member.MemberListService;
import springBootMVCShopping.service.member.MemberUpdateService;
import springBootMVCShopping.service.member.MembersDeleteService;

@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired
	MemberInsertService memberInsertService;
	@Autowired
	MemberAutoNumService memberAutoNumService;
	@Autowired
	MemberListService memberListService;
	@Autowired
	MemberDetailService memberDetailService;
	@Autowired
	MembersDeleteService membersDeleteService;
	
	@RequestMapping(value="memberList", method = RequestMethod.GET)
	public String list(Model model,
			@RequestParam(value = "searchWord", required = false) String searchWord,
			@RequestParam(value = "page" , required = false, defaultValue = "1" ) int page) {
		memberListService.execute(model, searchWord, page);
		return "thymeleaf/member/memberList";
		//return "member/memberList";
	}
	@GetMapping("memberRegist")
	public String form(MemberCommand memberCommand, Model model) {
		memberAutoNumService.execute(model);
		return "thymeleaf/member/memberForm";
		//return "member/memberForm";
	}
	@RequestMapping(value="memberRegist" , method = RequestMethod.POST)
	public String form(@Validated MemberCommand memberCommand, BindingResult result) {
		if(result.hasErrors()) {
			return "thymeleaf/member/memberForm";
		}
		if(!memberCommand.isMemberPwEqualsMemberPwCon()) {
			result.rejectValue("memberPwCon", "memberCommand.memberPwCon" , "비밀번호 확인이 틀렸습니다.");
			return "thymeleaf/member/memberForm";
		}else {
			memberInsertService.execute(memberCommand);
			return "redirect:memberList";
		}
	}
	@PostMapping("membersDelete")
	public String dels(@RequestParam(value = "memDels") String memDels[]) {
		membersDeleteService.execute(memDels);
		return "redirect:memberList";
	}

	@GetMapping("memberDetail")
	public String memberDetail(
			@RequestParam(value="memberNum") String memberNum,Model model) {
		memberDetailService.execute(memberNum, model);
		return "thymeleaf/member/memberInfo";
	}
	@RequestMapping("memberUpdate/{num}")
	public String memberUpdate(
			@PathVariable(value="num") String memberNum, Model model) {
		memberDetailService.execute(memberNum, model);
		return "thymeleaf/member/memberModify";
	}
	@Autowired
	MemberUpdateService memberUpdateService;
	@PostMapping("memberModify")
	public String memberModify(@Validated MemberCommand memberCommand, 
		BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("유효성검사체크");
			return "thymeleaf/member/memberModify";
		}
		memberUpdateService.execute(memberCommand);
		return "redirect:memberDetail?memberNum="+memberCommand.getMemberNum();
	}
	@Autowired
	MemberDeleteService memberDeleteService;
	@GetMapping("memberdelete")
	public String memberdelete(
			@RequestParam(value="memberNum") String memberNum) {
		memberDeleteService.execute(memberNum);
		return "redirect:memberList";
	}
}






