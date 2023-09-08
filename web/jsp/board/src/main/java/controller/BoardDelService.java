package controller;

import javax.servlet.http.HttpServletRequest;

import model.BoardDAO;

public class BoardDelService {
	public void execute(HttpServletRequest request) {
		String num = request.getParameter("num");
		BoardDAO dao = new BoardDAO();
		dao.boardDel(num);
	}
}
