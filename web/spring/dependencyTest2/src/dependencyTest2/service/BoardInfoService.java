package dependencyTest2.service;

import dependencyTest2.Repository.BoardRepository;
import dependencyTest2.model.BoardDTO;

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
