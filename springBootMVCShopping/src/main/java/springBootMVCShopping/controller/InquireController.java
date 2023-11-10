package springBootMVCShopping.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.InquireCommand;
import springBootMVCShopping.domain.InquireDTO;
import springBootMVCShopping.repository.InquireRepository;
import springBootMVCShopping.service.inquire.GoodsInquireDetailService;
import springBootMVCShopping.service.inquire.InquireListService;
import springBootMVCShopping.service.inquire.InquireModifyService;
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
	
	@Autowired
	InquireModifyService inquireModifyService;
	@PostMapping("inquireUpdate")
	public void inquireUpdate(InquireCommand inquireCommand , HttpServletResponse response) {
		inquireModifyService.execute(inquireCommand);		
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
	}
	@Autowired
	InquireRepository inquireRepository;
	@RequestMapping("inquireDelete")
	public @ResponseBody Integer inquireDelete(
			@RequestParam(value="inquireNum") Integer inquireNum) {
		System.out.println("inquireDelete :" + inquireNum);
		int i  = inquireRepository.inquireDelete(inquireNum);
		return i;
	}	
	
	@RequestMapping("goodsQuestion")
	public String goodsQuestion(Model model) {
		List<InquireDTO> list = inquireRepository.inquireList(null,null);
		model.addAttribute("list", list);
		return "thymeleaf/inquire/goodsQuestion";
	}
	
	@RequestMapping("goodsInquireDetail/{num}")
	public String goodsInquireDetail(
			@PathVariable(value="num") Integer inquireNum, Model model) {
		List<InquireDTO> list = inquireRepository.inquireList(null,inquireNum);
		model.addAttribute("list", list);
		model.addAttribute("newLineChar", "\n");
		return "thymeleaf/inquire/goodsInquireDetail"; 
	}
}









