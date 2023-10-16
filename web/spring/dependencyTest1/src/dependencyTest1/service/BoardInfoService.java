package dependencyTest1.service;

import dependencyTest1.Repository.BoardRepository;
import dependencyTest1.model.BoardDTO;

public class BoardInfoService {
	public void execute(Integer num) {
		BoardRepository boardRepository = new BoardRepository();
		BoardDTO dto = boardRepository.selectOne(num);
		BoardPrintService boardPrintService = new BoardPrintService();
		boardPrintService.print(dto);
	}
}
