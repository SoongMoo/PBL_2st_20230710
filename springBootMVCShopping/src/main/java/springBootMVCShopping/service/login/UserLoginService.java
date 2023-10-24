package springBootMVCShopping.service.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.LoginCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.mapper.UserMapper;

@Service
public class UserLoginService {
	@Autowired
	UserMapper userMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	public void execute(LoginCommand loginCommand
			, HttpSession session, BindingResult result) {
		String userId = loginCommand.getUserId();
		String userPw = loginCommand.getUserPw();
		AuthInfoDTO dto = userMapper.loginSelect(userId);
		System.out.println("userId : " + userId);
		if(userId != "" && userId != null) {
			if(dto != null) {
				if(dto.getUserEmailCheck() == null) {
					System.out.println("이메일 인증이 되지 않았을 때");
					result.rejectValue("userId", "loginCommand.userId"
							,"이메일 인증이 안되었습니다.");
				}else {
					if(passwordEncoder.matches(userPw, dto.getUserPw())) {
						System.out.println("비밀번호가 일치");
						session.setAttribute("auth", dto);
					}else {
						System.out.println("비밀번호가 일치하지 않을 때");
						result.rejectValue("userPw", "loginCommand.userPw"
								,"비밀번호가 틀렸습니다.");
					}
				}
			}else {
				System.out.println("아이디가 존재 하지 않았을 때");
				result.rejectValue("userId", "loginCommand.userId","아이디가 존재하지 않는다");
			}
		}
	}
}
