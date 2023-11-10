package springBootMVCShopping.service.inquire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.InquireCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.EmployeeDTO;
import springBootMVCShopping.domain.InquireDTO;
import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.mapper.EmployeeMyMapper;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.repository.InquireRepository;
import springBootMVCShopping.service.EmailSendService;

@Service
public class InquireAnswerWriteService {
	@Autowired
	EmployeeMyMapper employeeMyMapper;
	@Autowired
	InquireRepository inquireRepository;
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	EmailSendService emailSendService;
	public void execute(InquireCommand inquireCommand, HttpSession  session) {
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		EmployeeDTO emp = employeeMyMapper.employeeInfo(auth.getUserId());
		
		InquireDTO dto = new InquireDTO();
		dto.setInquireNum(inquireCommand.getInquireNum());
		dto.setInquireAnswer(inquireCommand.getInquireAnswer());
		dto.setEmpNum(emp.getEmpNum());
		int i = inquireRepository.inquireAnswerUpdate(dto);
		try {
		if(i > 0 ) {
			MemberDTO memDto = memberMapper.memberSelectOne(inquireCommand.getMemberNum());
			String subject = inquireCommand.getInquireSubject() +"의 답변";
			String content = inquireCommand.getInquireSubject() +"의 답변 <br />"  
						   + inquireCommand.getInquireAnswer().replace("\n", "<br />"); 
			String from = "hiland0@gamil.com";
			String to = memDto.getMemberEmail();
			emailSendService.mailsend(content, subject, from, to);
		}
		}catch(Exception e) {}
	}
}
