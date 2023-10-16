package dependencyTest1.service;

import dependencyTest1.Repository.BoardRepository;

public class BoardDeleteService {
	public void execute(Integer num) {
		BoardRepository boardRepository = new BoardRepository();
		boardRepository.boardDel(num);
	}
}
