package dependencyTest3.service;

import dependencyTest3.Repository.BoardRepository;
import dependencyTest3.command.BoardCommand;
import dependencyTest3.model.BoardDTO;

public class BoardWriteService {
	BoardRepository boardRepository;
	public BoardWriteService(BoardRepository boardRepository){
		this.boardRepository = boardRepository;
	}
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
