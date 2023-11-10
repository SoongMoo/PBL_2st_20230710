package springBootMVCShopping.controller;

import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.InquireCommand;
import springBootMVCShopping.service.inquire.GoodsInquireDetailService;
import springBootMVCShopping.service.inquire.InquireListService;
import springBootMVCShopping.service.inquire.InquireWriteService;

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
			@ModelAttribute(value="goodsNum") String goodsNum,
			@ModelAttribute(value="inquireCommand") InquireCommand inquireCommand) {
		return "thymeleaf/inquire/inquireWrite";
	}
	@Autowired
	InquireWriteService inquireWriteService;
	@PostMapping("inquireWrite")
	public String  inquireWrite(InquireCommand inquireCommand, BindingResult result,
			HttpSession session, HttpServletResponse response) {
		inquireWriteService.execute(inquireCommand, session, result);
		if(result.hasErrors()) {
			return "thymeleaf/inquire/inquireWrite";
		}
		try {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			String str = "<script>"
					+ "opener.parent.inquire();"
					+ "window.self.close()"
					+ "</script>";
			out.print(str);
			out.close();
		}catch(Exception e) {}
		return null;
	}
	@Autowired
	GoodsInquireDetailService goodsInquireDetailService;
	@GetMapping("inquireUpdate")
	public String inquireUpdate(
			@RequestParam(value="inquireNum") Integer inquireNum, Model model) {
		goodsInquireDetailService.execute(inquireNum,model);
		return "thymeleaf/inquire/goodsInquireUpdate"; 
	}
}









