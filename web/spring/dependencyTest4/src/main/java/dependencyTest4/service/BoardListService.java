package dependencyTest4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dependencyTest4.Repository.BoardRepository;
import dependencyTest4.model.BoardDTO;

public class BoardListService {
	@Autowired
	BoardRepository boardRepository;
	@Autowired
	BoardPrintService boardPrintService;
	public void execute() {
		List<BoardDTO> list = boardRepository.selectAll();
		for(BoardDTO dto : list) {
			boardPrintService.print(dto);
		}
	}
}