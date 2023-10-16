package dependencyTest1.service;

import dependencyTest1.Repository.BoardRepository;
import dependencyTest1.model.BoardDTO;

public class BoardModifyService {
	public void execute(String [] attrs) {
		BoardDTO dto = new  BoardDTO();
		dto.setContents(attrs[3]);
		dto.setNum(Integer.parseInt(attrs[1]));
		dto.setSubject(attrs[2]);
		BoardRepository boardRepository = new BoardRepository();
		boardRepository.boardUpdate(dto);
	}
}