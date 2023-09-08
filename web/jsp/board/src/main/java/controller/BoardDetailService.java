package controller;

import javax.servlet.http.HttpServletRequest;

import model.BoardDAO;
import model.BoardDTO;

public class BoardDetailService {
	public void execute(HttpServletRequest request) {
		String num = request.getParameter("num");
		BoardDAO dao = new BoardDAO();

              //// 추가
		BoardDTO dto = dao.selectOne(num); 					
		request.setAttribute("dto", dto);
	}
}
