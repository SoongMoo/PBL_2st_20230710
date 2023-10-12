package boardSpringBoot.service.board;

import org.springframework.stereotype.Service;

import boardSpringBoot.command.BoardCommand;
import boardSpringBoot.model.BoardDAO;
import boardSpringBoot.model.BoardDTO;

@Service
public class BoardWriteService {
	public void execute(BoardCommand boardCommand) {
		String boardWriter = boardCommand.getBoardWriter();
		String boardSubject = boardCommand.getBoardSubject();
		String boardContent = boardCommand.getBoardContent();

		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(boardContent);
		dto.setBoardSubject(boardSubject);
		dto.setBoardWriter(boardWriter);

		BoardDAO dao = new BoardDAO();
		dao.boardInsert(dto);
	}
}
