package service;

import model.BoardDAO;

public class BoardDelService {
	public void execute(String num) {
		BoardDAO dao = new BoardDAO();
		dao.boardDel(num);
	}
}
