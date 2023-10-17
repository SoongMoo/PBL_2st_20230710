package dependencyTest3.service;

import dependencyTest3.Repository.BoardRepository;;

public class BoardDeleteService {
	BoardRepository boardRepository;
	public BoardDeleteService(BoardRepository boardRepository){
		this.boardRepository = boardRepository;
	}
	public void execute(Integer num) {
		boardRepository.boardDel(num);
	}
}
