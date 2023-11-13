package springBootMVCShopping.controller;


import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.service.login.IdcheckService;
import springBootMVCShopping.service.login.UserLoginService;

@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	IdcheckService idcheckService;
	@Autowired
	UserLoginService userLoginService;
	
	@GetMapping("logout")
	public String logout(HttpSession session, HttpServletResponse response) {
		Cookie cookie = new Cookie("autoLogin", "");
		cookie.setPath("/");
		cookie.setMaxAge(0);
		response.addCookie(cookie);	
		
		session.invalidate();
		return "redirect:/";
	}
	@PostMapping("login")
	public String login(@Validated LoginCommand loginCommand, BindingResult result 
			, HttpSession session, HttpServletResponse response) {
		userLoginService.execute(loginCommand, session, result, response);
		if(result.hasErrors()) {
			return "thymeleaf/index";
		}
		return "redirect:/";
	}
	@PostMapping("userIdCheck")
	public @ResponseBody String userIdCheck(
			@RequestParam(value="userId") String userId) {
		String resultId = idcheckService.execute(userId);
		if(resultId == null) {
			return "사용가능한 아이디입니다.";
		}else {
			return "사용중인 아이디입니다.";
		}
	}
	@RequestMapping(value="item.login",method= RequestMethod.GET)
	public String item(LoginCommand loginCommand) {
		return "thymeleaf/login";
	}
	@RequestMapping(value="item.login",method= RequestMethod.POST)
	public String item(@Validated LoginCommand loginCommand, BindingResult result, 
			HttpSession session, HttpServletResponse response) {
		userLoginService.execute(loginCommand, session, result, response);
		if(result.hasErrors()) {
			return "thymeleaf/login";
		}
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String str = "<script language='javascript'>"
				   + " opener.location.reload();"
				   + " window.self.close();"
				   + " </script>"; 
		out.print(str);
		out.close();
		return null;
	}
	
	
	
	
	
	
	
	
	
}