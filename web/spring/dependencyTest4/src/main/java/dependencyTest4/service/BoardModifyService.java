package dependencyTest4.service;

import org.springframework.beans.factory.annotation.Autowired;

import dependencyTest4.Repository.BoardRepository;
import dependencyTest4.model.BoardDTO;

public class BoardModifyService {
	@Autowired // 객체 자동 주입
	BoardRepository boardRepository;
	public void execute(String [] attrs) {
		BoardDTO dto = new  BoardDTO();
		dto.setContents(attrs[3]);
		dto.setNum(Integer.parseInt(attrs[1]));
		dto.setSubject(attrs[2]);
		boardRepository.boardUpdate(dto);
	}
}