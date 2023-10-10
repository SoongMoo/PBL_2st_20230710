package controller.inquire;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import model.InquireDAO;

public class InquireUpdateService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String inquireNum = request.getParameter("inquireNum");
		String inquireSubject= request.getParameter("inquireSubject");
		String inquireContent= request.getParameter("inquireContent");
		
		InquireDAO dao = new InquireDAO();
		dao.inquireUpdate(inquireNum,inquireSubject,inquireContent);
	}
}
