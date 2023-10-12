package boardSpringBoot.service.board;

import org.springframework.stereotype.Service;

import boardSpringBoot.command.BoardCommand;
import boardSpringBoot.model.BoardDAO;
import boardSpringBoot.model.BoardDTO;

@Service
public class BoardModifyService {
	public void execute(BoardCommand boardCommand) {
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(boardCommand.getBoardContent());
		dto.setBoardNum( boardCommand.getBoardNum());
		dto.setBoardSubject(boardCommand.getBoardSubject());
		dto.setBoardWriter(boardCommand.getBoardWriter());
		BoardDAO dao = new BoardDAO();
		dao.boardUpdate(dto); 
	}
}