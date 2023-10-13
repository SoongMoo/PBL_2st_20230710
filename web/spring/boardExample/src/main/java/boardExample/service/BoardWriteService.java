package boardExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boardExample.command.BoardCommand;
import boardExample.domain.BoardDTO;
import boardExample.mapper.BoardMapper;

@Service
public class BoardWriteService {
	@Autowired //  dependency injection (DI)
	BoardMapper boardMapper;// mapper에 있는 객체 생성
	public void execute(BoardCommand boardCommand) {
		String writer = boardCommand.getBoardWriter();
		String subject = boardCommand.getBoardSubject();
		String contents = boardCommand.getBoardContent();
		BoardDTO dto = new BoardDTO();
		dto.setContents(contents);
		dto.setSubject(subject);
		dto.setWriter(writer);
		boardMapper.boardInsert(dto);
	}
}
