package dependencyTest4.service;

import org.springframework.beans.factory.annotation.Autowired;

import dependencyTest4.Repository.BoardRepository;;

public class BoardDeleteService {
	@Autowired
	BoardRepository boardRepository;
	public void execute(Integer num) {
		boardRepository.boardDel(num);
	}
}
