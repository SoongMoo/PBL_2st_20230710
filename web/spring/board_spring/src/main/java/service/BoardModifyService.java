package service;

import command.BoardCommand;
import model.BoardDAO;
import model.BoardDTO;

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