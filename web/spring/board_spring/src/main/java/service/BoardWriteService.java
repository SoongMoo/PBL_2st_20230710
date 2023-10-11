package service;

import command.BoardCommand;
import model.BoardDAO;
import model.BoardDTO;

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
