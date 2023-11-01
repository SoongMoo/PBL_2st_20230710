package springBootMVCShopping.service.employeeMyPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.mapper.EmployeeMyMapper;

@Service
public class EmployeePassConfirmService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	EmployeeMyMapper employeeMyMapper;
	public boolean execute(String newPw, String oldPw, HttpSession session) {
		
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(passwordEncoder.matches(oldPw, auth.getUserPw())){
			String userPw = passwordEncoder.encode(newPw);
			employeeMyMapper.employeePwUpdate(userPw, auth.getUserId());
			auth.setUserPw(userPw);
			return true;
		}else {
			return false;
		}
	}
}
