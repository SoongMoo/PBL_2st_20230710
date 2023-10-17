package dependencyTest3.service;

import dependencyTest3.Repository.BoardRepository;
import dependencyTest3.model.BoardDTO;

public class BoardModifyService {
	BoardRepository boardRepository;
	public BoardModifyService(BoardRepository boardRepository){
		this.boardRepository = boardRepository;
	}
	public void execute(String [] attrs) {
		BoardDTO dto = new  BoardDTO();
		dto.setContents(attrs[3]);
		dto.setNum(Integer.parseInt(attrs[1]));
		dto.setSubject(attrs[2]);
		boardRepository.boardUpdate(dto);
	}
}