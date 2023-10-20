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

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.service.member.MemberAutoNumService;
import springBootMVCShopping.service.member.MemberInsertService;
import springBootMVCShopping.service.member.MemberListService;
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
	@RequestMapping(value="memberList", method = RequestMethod.GET)
	public String list(Model model,
			@RequestParam(value = "searchWord", required = false) String searchWord) {
		memberListService.execute(model, searchWord);
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
		System.out.println("svdagvb");
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
	@Autowired
	MembersDeleteService membersDeleteService;
	@PostMapping("membersDelete")
	public String dels(@RequestParam(value = "memDels") String memDels[]) 
	{
		membersDeleteService.execute(memDels);
		return "redirect:memberList";
	}
	
}






