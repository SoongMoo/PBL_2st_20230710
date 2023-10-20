package springBootMVCShopping.controller;

import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		URL resource = getClass().getClassLoader().getResource("templates/thymeleaf");
		String filePath = resource.getFile();
		System.out.println(filePath);
		return "thymeleaf/index";
	}
}
