package controller.memberMyPage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.MemberDTO;
import model.MemberMyDAO;

public class MemberInfoService {
	public void execute(HttpServletRequest request) {
		HttpSession session = request.getSession();
		AuthInfoDTO authInfo = (AuthInfoDTO)session.getAttribute("dto");
		String memberId = authInfo.getUserId();
		MemberMyDAO dao = new MemberMyDAO();
		MemberDTO dto =  dao.memberInfo(memberId);
		request.setAttribute("dto", dto);
	}
}
