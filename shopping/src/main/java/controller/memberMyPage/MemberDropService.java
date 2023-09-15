package controller.memberMyPage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.MemberMyDAO;

public class MemberDropService {
	public int execute(HttpServletRequest request) {
		String memberPw = request.getParameter("memberPw");
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("dto");
		if(memberPw.equals(auth.getUserPw())) {
			MemberMyDAO dao = new MemberMyDAO();
			dao.memberDrop(auth.getUserId());
			return 1;
		}else {
			request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
			return 0;
		}
	}
}
