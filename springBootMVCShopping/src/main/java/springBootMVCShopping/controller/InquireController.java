package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springBootMVCShopping.service.inquire.InquireListService;

@Controller
@RequestMapping("inquire")
public class InquireController {
	@Autowired
	InquireListService inquireListService;
	@RequestMapping("inquireList")
	public String inquireList(
			@ModelAttribute("goodsNum") String goodsNum, Model model
			) {
		inquireListService.execute(goodsNum, model);
		model.addAttribute("newLineChar", "\n");
		return "thymeleaf/inquire/inquireList";
	}
	@GetMapping("inquireWrite")
	public String inquireWrite(
			@ModelAttribute(value="goodsNum") String goodsNum) {
		return "thymeleaf/inquire/inquireWrite";
	}
}









