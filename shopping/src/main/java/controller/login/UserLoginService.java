package controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.UserDAO;

public class UserLoginService {
	public int execute(HttpServletRequest request) {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		UserDAO dao = new UserDAO(); 
		AuthInfoDTO dto = dao.loginSelect(userId);
		HttpSession session = request.getSession();
		int i = 0;
		if(dto == null) {
			request.setAttribute("errId", "아이디가 존재하지 않습니다.");
		}else {
			if(dto.getUserPw().equals(userPw)) {
				session.setAttribute("dto", dto);
				session.setAttribute("auth", dto);
				i = 1;
			}else {
				request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
			}
		}
		return i;
	}
}
