package controller.memberMyPage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.MemberMyDAO;

public class MemberPasswordService {
	public int execute(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("dto");
		String oldPw = request.getParameter("oldPw");
		String newPw = request.getParameter("newPw");
		String memberId = auth.getUserId();
		if(oldPw.equals(auth.getUserPw())) {
			 System.out.println("현재비밀번호가 맞습니다.");
			 MemberMyDAO dao = new MemberMyDAO();
			 dao.memberPwUpdate(memberId, newPw);
			 auth.setUserPw(newPw);
			 
			 return 1;
		}else {
			request.setAttribute("errPw", "현재비밀번호가 일치하지 않습니다.");
			return 0;
		}
	}
}
