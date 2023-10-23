package springBootMVCShopping.service.memberRegister;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.command.MemberCommand;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.UserMapper;
import springBootMVCShopping.service.EmailSendService;
@Service
public class UserWriteService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UserMapper userMapper;
	@Autowired
	EmailSendService emailSendService;
	public void execute(MemberCommand memberCommand,Model model) {
		String memberId = memberCommand.getMemberId();
		String memberPw = memberCommand.getMemberPw();
		String memberName = memberCommand.getMemberName();
		String memberPhone1 = memberCommand.getMemberPhone1();
		String memberPhone2 = memberCommand.getMemberPhone2();
		String memberAddr = memberCommand.getMemberAddr();
		String memberAddrDetail = memberCommand.getMemberAddr2();
		String memberPost = memberCommand.getMemberPost();
		String memberEmail = memberCommand.getMemberEmail();
		Date memberBirth = memberCommand.getMemberBirth();
		String memberGender = memberCommand.getMemberGender();
		
		MemberDTO dto = new MemberDTO();
		dto.setMemberAddr(memberAddr);
		dto.setMemberAddrDetail(memberAddrDetail);
		dto.setMemberEmail(memberEmail);
		dto.setGender(memberGender);
		dto.setMemberId(memberId);
		dto.setMemberName(memberName);
		dto.setMemberPhone1(memberPhone1);
		dto.setMemberPhone2(memberPhone2);
		dto.setMemberPost(memberPost);
		dto.setMemberPw(passwordEncoder.encode(memberPw));
		dto.setMemberBirth(memberBirth);
		
		int i = userMapper.userInsert(dto);
		model.addAttribute("userName", dto.getMemberName());
		model.addAttribute("userEmail", dto.getMemberEmail());
		if (i >= 1) {
			/// 메일링
			String html= "<html><body>"
			+ "    이숭무님 회원 가입을 축하합니다. <br />"
			+ " 가입을 완료하시려면 "
			+ "<a href='http://192.168.44.2:8080/userConfirm?chk=" + dto.getMemberEmail() 
			+ "'>여기</a>"
			+ "를 눌러주세요";
			String subject = "환영 인사입니다.";
			String fromEmail = "soongmoostudent@gmail.com";
			String toEmail = dto.getMemberEmail();
			emailSendService.mailsend(html, subject, fromEmail, toEmail);
		}
	}
}