package controller.members;

import javax.servlet.http.HttpServletRequest;

import model.MemberDAO;
import model.MemberDTO;




public class MemberDetailService {
	public void execute(HttpServletRequest request) {
		String memberNum = request.getParameter("memberNum");
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.selectOne(memberNum);
		request.setAttribute("dto", dto);
		
	}
}
