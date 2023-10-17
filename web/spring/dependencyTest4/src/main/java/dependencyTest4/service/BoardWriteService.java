package dependencyTest4.service;

import org.springframework.beans.factory.annotation.Autowired;

import dependencyTest4.Repository.BoardRepository;
import dependencyTest4.command.BoardCommand;
import dependencyTest4.model.BoardDTO;

public class BoardWriteService {
	@Autowired
	BoardRepository boardRepository;
	public void execute(BoardCommand boardCommand){
		String writer = boardCommand.getWriter();
		String subject = boardCommand.getSubject();
		String contents = boardCommand.getContents();
		BoardDTO dto = new BoardDTO();
		dto.setContents(contents);
		dto.setSubject(subject);
		dto.setWriter(writer);
		boardRepository.boardInsert(dto);
		//BoardDAO dao = new BoardDAO();
		//dao.boardInsert(dto);
	}
}
