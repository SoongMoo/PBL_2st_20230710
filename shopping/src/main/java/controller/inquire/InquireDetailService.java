package controller.inquire;

import javax.servlet.http.HttpServletRequest;

import model.InquireDAO;
import model.InquireDTO;

public class InquireDetailService {
	public void execute(HttpServletRequest request) {
		String inquireNum = request.getParameter("inquireNum");
		System.out.println(inquireNum);
		InquireDAO dao = new InquireDAO();
		InquireDTO dto = dao.selectOne(inquireNum);
		request.setAttribute("dto", dto);
	}
}
