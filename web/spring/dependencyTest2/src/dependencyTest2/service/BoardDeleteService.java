package dependencyTest2.service;

import dependencyTest2.Repository.BoardRepository;;

public class BoardDeleteService {
	BoardRepository boardRepository;
	public BoardDeleteService(BoardRepository boardRepository){
		this.boardRepository = boardRepository;
	}
	public void execute(Integer num) {
		boardRepository.boardDel(num);
	}
}
