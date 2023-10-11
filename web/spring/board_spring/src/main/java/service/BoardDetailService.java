package service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import model.BoardDAO;
import model.BoardDTO;

public class BoardDetailService {
	public void execute(String num, Model model) {
		BoardDAO dao = new BoardDAO();
              //// 추가
		BoardDTO dto = dao.selectOne(num); 					
		model.addAttribute("dto", dto);
	}
}
