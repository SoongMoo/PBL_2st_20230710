package controller.login;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AuthInfoDTO;
import model.UserDAO;

public class UserLoginService {
	public int execute(HttpServletRequest request,
			HttpServletResponse response) {
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
				String storeId = request.getParameter("storeId");
				String keepLogin = request.getParameter("keepLogin");
				if(keepLogin != null && keepLogin.equals("on")) {
					System.out.println("자동 로그인 쿠키 생성");
					Cookie cookie = new Cookie("autoLogin",dto.getUserId());
					cookie.setPath("/");
					cookie.setMaxAge(60*60*24*30);
					response.addCookie(cookie);
				}
				if(storeId != null && storeId.equals("store")) {
					System.out.println("쿠키생성");
					Cookie cookie = new Cookie("storeId",dto.getUserId());
					cookie.setPath("/");
					cookie.setMaxAge(60*60*24*30);
					response.addCookie(cookie);
				}else {
					System.out.println("쿠키삭제");
					Cookie cookie = new Cookie("storeId","");
					cookie.setPath("/");
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
				i = 1;
			}else {
				request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
			}
		}
		return i;
	}
}
