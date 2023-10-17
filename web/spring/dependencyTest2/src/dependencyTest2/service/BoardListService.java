package dependencyTest2.service;

import java.util.List;

import dependencyTest2.Repository.BoardRepository;
import dependencyTest2.model.BoardDTO;

public class BoardListService {
	BoardRepository boardRepository;
	BoardPrintService boardPrintService;
	public BoardListService(BoardRepository boardRepository
			,BoardPrintService boardPrintService){
		this.boardRepository = boardRepository;
		this.boardPrintService = boardPrintService;
	}
	public void execute() {
		List<BoardDTO> list = boardRepository.selectAll();
		for(BoardDTO dto : list) {
			boardPrintService.print(dto);
		}
	}
}