package boardExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boardExample.command.BoardCommand;
import boardExample.domain.BoardDTO;
import boardExample.mapper.BoardMapper;

@Service
public class BoardModifyService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(BoardCommand boardCommand) {
		BoardDTO dto = new BoardDTO();
		dto.setContents(boardCommand.getBoardContent());
		dto.setNum(boardCommand.getBoardNum());
		dto.setSubject(boardCommand.getBoardSubject());
		dto.setWriter(boardCommand.getBoardWriter());
		boardMapper.boardUpdate(dto);
	}
}
