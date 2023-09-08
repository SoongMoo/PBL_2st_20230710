package controller;

import javax.servlet.http.HttpServletRequest;

import model.BoardDAO;
import model.BoardDTO;

public class BoardModifyService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		}catch(Exception e) {}
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(request.getParameter("boardContent"));
		dto.setBoardNum( Integer.parseInt(request.getParameter("boardNum")));
		dto.setBoardSubject(request.getParameter("boardSubject"));
		dto.setBoardWriter(request.getParameter("boardWriter"));
		BoardDAO dao = new BoardDAO();
		dao.boardUpdate(dto); 
	}
}
