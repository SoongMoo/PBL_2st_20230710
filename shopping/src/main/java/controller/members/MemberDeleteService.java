package controller.members;

import javax.servlet.http.HttpServletRequest;

import model.MemberDAO;



public class MemberDeleteService {
	public void execute(HttpServletRequest request) {
		 String memberNum = request.getParameter("memberNum");
		 MemberDAO dao = new MemberDAO();
		 dao.memberDelete(memberNum);
	}
}
