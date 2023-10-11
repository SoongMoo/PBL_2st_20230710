package controller.inquire;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.EmployeeDAO;
import model.EmployeeDTO;
import model.InquireDAO;
import model.InquireDTO;

public class InquireAnswerService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String inquireNum = request.getParameter("inquireNum");
		String inquireAnswer = request.getParameter("inquireAnswer");
		
		HttpSession session = request.getSession();
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("auth");
		EmployeeDAO empDao = new EmployeeDAO();
		String empNum = empDao.getEmpNum(authInfo.getUserId());
		
		InquireDTO dto= new InquireDTO();
		dto.setInquireNum(Long.parseLong(inquireNum));
		dto.setInquireAnswer(inquireAnswer);
		dto.setEmpNum(empNum);
		
		InquireDAO dao= new InquireDAO();
		dao.inquireReplyUpdate(dto);
	}
}
