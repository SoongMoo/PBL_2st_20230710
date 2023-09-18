package controller.help;

import javax.servlet.http.HttpServletRequest;

import model.FindDAO;

public class FindIdService {
	public void execute(HttpServletRequest request) {
		String userPhone = request.getParameter("userPhone");
		String userEmail = request.getParameter("userEmail");
		FindDAO dao = new FindDAO();
		String userId = dao.findId(userPhone, userEmail);
		request.setAttribute("userId", userId);
	}
}
