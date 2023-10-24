package springBootMVCShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springBootMVCShopping.command.FindIdCommand;

@Controller
@RequestMapping("help")
public class HelpController {
	@RequestMapping(value="findId", method = RequestMethod.GET)
	public String findId() {
		return "thymeleaf/help/findId";
	}
	@RequestMapping(value="findId", method = RequestMethod.POST)
	public String findId(@Validated FindIdCommand findIdCommand,
			BindingResult result) {
		if(result.hasErrors()) {
			return "thymeleaf/help/findId";
		}
		return "thymeleaf/help/findIdOk";
	}
}
