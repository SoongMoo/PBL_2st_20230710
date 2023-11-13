package springBootMVCShopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.mapper.UserMapper;

@Service
public class CookiesService {
	@Autowired
	UserMapper userMapper;
	public void execute(HttpServletRequest request, Model model) {
		Cookie [] cookies = request.getCookies();
		if(cookies != null && cookies.length > 0) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("idStore")) {
					LoginCommand loginCommand = new LoginCommand();
					loginCommand.setUserId(cookie.getValue());
					loginCommand.setIdStore(true);
					model.addAttribute("loginCommand", loginCommand);
				}
				if(cookie.getName().equals("autoLogin")) {
					AuthInfoDTO auth = userMapper.loginSelect(cookie.getValue());
					HttpSession session = request.getSession();
					session.setAttribute("auth", auth);
				}
			}
		}
	}
}
