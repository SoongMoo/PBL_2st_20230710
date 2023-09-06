package controler;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import model.BoardDAO;
import model.BoardDTO;

public class BoardWriteService {
	public void execute(HttpServletRequest request) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String writer = request.getParameter("writer");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		BoardDTO dto = new BoardDTO();
		dto.setContents(content);
		dto.setSubject(subject);
		dto.setWriter(writer);
		BoardDAO dao = new BoardDAO();
		dao.boardInsert(dto);
	}
}
