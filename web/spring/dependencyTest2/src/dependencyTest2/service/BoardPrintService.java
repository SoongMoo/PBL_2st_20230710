package dependencyTest2.service;

import dependencyTest2.model.BoardDTO;
public class BoardPrintService {
	public void print(BoardDTO dto) {
		System.out.println("번호 \t 이름 \t 제목");
		System.out.println(dto.getNum() + " \t " 
						  +dto.getWriter() + " \t " 
						  +dto.getSubject());
	}
}
