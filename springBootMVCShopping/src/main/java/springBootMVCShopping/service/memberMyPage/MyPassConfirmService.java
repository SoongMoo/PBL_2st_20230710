package springBootMVCShopping.service.memberMyPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.mapper.MemberMyMapper;

@Service
public class MyPassConfirmService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	MemberMyMapper memberMyMapper;
	public boolean execute(String newPw,String oldPw, HttpSession session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		if(passwordEncoder.matches(oldPw, auth.getUserPw())) {
			memberMyMapper.memberPwUpdate(passwordEncoder.encode(newPw), auth.getUserId());
			return true;
		}else return false;
	}
}
