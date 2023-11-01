package springBootMVCShopping.service.employeeMyPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;

@Service
public class EmployeePwModifyService {
	@Autowired
	PasswordEncoder passwordEncoder;

	public String execute(HttpSession session, Model model, String empPw) {

		AuthInfoDTO auth = (AuthInfoDTO) session.getAttribute("auth");
		if (passwordEncoder.matches(empPw, auth.getUserPw())) {
			return "thymeleaf/worker/myNewPw";
		}else {
			model.addAttribute("errPw", "비밀번호가 틀렸습니다.");
			 return "thymeleaf/worker/myPwCon";
		}
	}
}