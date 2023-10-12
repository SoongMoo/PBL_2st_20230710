package boardExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boardExample.command.BoardCommand;
import boardExample.domain.BoardDTO;
import boardExample.mapper.BoardMapper;
@Service
public class BoardWriteService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(BoardCommand boardCommand) {
		String boardWriter = boardCommand.getBoardWriter();
		String boardSubject =boardCommand.getBoardSubject();
		String boardContent = boardCommand.getBoardContent();
		
		BoardDTO dto = new BoardDTO();
		dto.setBoardContent(boardContent);
		dto.setBoardSubject(boardSubject);
		dto.setBoardWriter(boardWriter);
		boardMapper.boardInsert(dto);
		
	}
}
