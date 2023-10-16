package dependencyTest1.service;

import java.util.List;

import dependencyTest1.Repository.BoardRepository;
import dependencyTest1.model.BoardDTO;

public class BoardListService {
	public void execute() {
		BoardRepository boardRepository = new BoardRepository();
		List<BoardDTO> list = boardRepository.selectAll();
		for(BoardDTO dto : list) {
			System.out.println("번호 \t 이름 \t 제목");
			System.out.println(dto.getNum() + " \t " 
							  +dto.getWriter() + " \t " 
							  +dto.getSubject());
		}
	}
}
