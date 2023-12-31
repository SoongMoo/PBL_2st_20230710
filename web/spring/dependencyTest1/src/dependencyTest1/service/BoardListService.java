package dependencyTest1.service;

import java.util.List;

import dependencyTest1.Repository.BoardRepository;
import dependencyTest1.model.BoardDTO;

public class BoardListService {
	public void execute() {
		BoardRepository boardRepository = new BoardRepository();
		List<BoardDTO> list = boardRepository.selectAll();
		BoardPrintService boardPrintService = new BoardPrintService();
		for(BoardDTO dto : list) {
			boardPrintService.print(dto);
		}
	}
}