package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.BoardDAO;
import model.BoardDTO;

public class BoradListService {
	public void execute(HttpServletRequest request) {
		BoardDAO dao = new BoardDAO();
		///// 추가
		List<BoardDTO> list = dao.selectAll();
		request.setAttribute("lists", list);
		System.out.println();
	}
}
