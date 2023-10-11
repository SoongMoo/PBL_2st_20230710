package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import model.BoardDAO;
import model.BoardDTO;

public class BoardListService {
	public void execute(Model model) {
		BoardDAO dao = new BoardDAO();
		///// 추가
		List<BoardDTO> list = dao.selectAll();
		model.addAttribute("lists", list);
		System.out.println();
	}
}
