package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.service.member.MemberInsertService;

@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired
	MemberInsertService memberInsertService;
	@RequestMapping(value="memberList", method = RequestMethod.GET)
	public String list() {
		return "thymeleaf/member/memberList";
	}
	@GetMapping("memberRegist")
	public String form() {
		return "thymeleaf/member/memberForm";
	}
	@RequestMapping(value="memberRegist" , method = RequestMethod.POST)
	public String form(MemberCommand memberCommand) {
		memberInsertService.execute(memberCommand);
		return "redirect:memberList";
	}
}
