package springBootMVCShopping.controller;

import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.command.LoginCommand;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(
			@ModelAttribute("loginCommand") LoginCommand loginCommand) {
		URL resource = getClass().getClassLoader().getResource("templates/thymeleaf");
		String filePath = resource.getFile();
		System.out.println(filePath);
		return "thymeleaf/index";
	}
}
