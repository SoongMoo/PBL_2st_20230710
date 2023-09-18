package controller.help;

import java.util.Date;
import java.util.Properties;
import java.util.UUID;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import model.AuthInfoDTO;
import model.FindDAO;

public class FindPwService {
	public void execute(HttpServletRequest request) {
		
		String userId = request.getParameter("userId");
		String userPhone = request.getParameter("userPhone");
		
		FindDAO dao = new FindDAO();
		AuthInfoDTO dto = dao.userEmail(userId, userPhone);
		
		if (dto != null) {
			String newPw = UUID.randomUUID().toString().substring(0, 8);
			dto.setUserId(userId);
			dto.setUserPw(newPw);
			dao.pwUpdate(dto);
			request.setAttribute("dto", dto);			
		}
	}
}