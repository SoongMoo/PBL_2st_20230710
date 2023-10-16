package dependencyTest1.service;

import dependencyTest1.Repository.BoardRepository;
import dependencyTest1.command.BoardCommand;
import dependencyTest1.model.BoardDTO;

public class BoardWriteService {
	public void execute(BoardCommand boardCommand){
		String writer = boardCommand.getWriter();
		String subject = boardCommand.getSubject();
		String contents = boardCommand.getContents();
		BoardDTO dto = new BoardDTO();
		dto.setContents(contents);
		dto.setSubject(subject);
		dto.setWriter(writer);
		BoardRepository boardRepository = new BoardRepository();
		boardRepository.boardInsert(dto);
		//BoardDAO dao = new BoardDAO();
		//dao.boardInsert(dto);
	}
}
