package springBootMVCShopping.service.help;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.mapper.FindMapper;
import springBootMVCShopping.service.EmailSendService;

@Service
public class FindPwService {
	@Autowired
	FindMapper findMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	EmailSendService emailSendService;
	public void execute(String userId, String userPhone, Model model) {
		AuthInfoDTO dto = findMapper.userEmail(userId, userPhone);
		if (dto != null) {
			String newPw = UUID.randomUUID().toString().substring(0, 8);
			dto.setUserId(userId);
			dto.setUserPw(passwordEncoder.encode(newPw));
			if(dto.getGrade().equals("mem")) {
				dto.setTableName("members");
				dto.setPwColumName("member_pw");
				dto.setUserIdColumName("member_id");
			}else {
				dto.setTableName("employees");
				dto.setPwColumName("emp_pw");
				dto.setUserIdColumName("emp_id");
			}
			findMapper.pwUpdate(dto);
			model.addAttribute("dto", dto);
			String html= "<html><body>"
					+ dto.getUserName() + "님의 임시 비밀번호는 " + newPw
					+ "입니다. </body></html>";
			String subject = dto.getUserName()+"의 임시비밀번호";
			String fromEmail = "soongmoostudent@gmail.com";
			String toEmail = dto.getUserEmail();
			emailSendService.mailsend(html, subject, fromEmail, toEmail);
		}
	}
}
