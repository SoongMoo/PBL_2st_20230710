package dependencyTest4.service;

import org.springframework.beans.factory.annotation.Autowired;

import dependencyTest4.Repository.BoardRepository;
import dependencyTest4.model.BoardDTO;

public class BoardInfoService {
	@Autowired
	BoardRepository boardRepository;
	@Autowired
	BoardPrintService boardPrintService;
	public void execute(Integer num) {
		BoardDTO dto = boardRepository.selectOne(num);
		boardPrintService.print(dto);
	}
}
