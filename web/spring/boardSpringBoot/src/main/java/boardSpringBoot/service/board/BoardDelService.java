package boardSpringBoot.service.board;

import org.springframework.stereotype.Service;

import boardSpringBoot.model.BoardDAO;
@Service
public class BoardDelService {
	public void execute(String num) {
		BoardDAO dao = new BoardDAO();
		dao.boardDel(num);
	}
}
