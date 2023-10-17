package dependencyTest3.service;

import dependencyTest3.Repository.BoardRepository;
import dependencyTest3.model.BoardDTO;

public class BoardInfoService {
	BoardRepository boardRepository;
	BoardPrintService boardPrintService;
	public BoardInfoService(BoardRepository boardRepository
			,BoardPrintService boardPrintService){
		this.boardRepository = boardRepository;
		this.boardPrintService = boardPrintService;
	}
	public void execute(Integer num) {
		BoardDTO dto = boardRepository.selectOne(num);
		boardPrintService.print(dto);
	}
}
