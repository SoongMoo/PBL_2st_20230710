package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.service.goods.MainGoodsListService;

@Controller
public class MainController {
	@Autowired
	MainGoodsListService mainGoodsListService;
	@RequestMapping("/")
	public String index(
			@ModelAttribute("loginCommand") LoginCommand loginCommand,
			Model model ,HttpSession session) {
		mainGoodsListService.execute(null, model, session);
		return "thymeleaf/index";
	}
}
