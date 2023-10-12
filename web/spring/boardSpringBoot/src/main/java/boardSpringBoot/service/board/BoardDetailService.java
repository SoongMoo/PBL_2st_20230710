package boardSpringBoot.service.board;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import boardSpringBoot.model.BoardDAO;
import boardSpringBoot.model.BoardDTO;
@Service
public class BoardDetailService {
	public void execute(String num, Model model) {
		BoardDAO dao = new BoardDAO();
              //// 추가
		BoardDTO dto = dao.selectOne(num); 					
		model.addAttribute("dto", dto);
	}
}
