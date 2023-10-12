package boardSpringBoot.service.board;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import boardSpringBoot.model.BoardDAO;
import boardSpringBoot.model.BoardDTO;

@Service
public class BoardListService {
	public void execute(Model model) {
		BoardDAO dao = new BoardDAO();
		///// 추가
		List<BoardDTO> list = dao.selectAll();
		model.addAttribute("lists", list);
		System.out.println();
	}
}
