package boardExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import boardExample.domain.BoardDTO;
import boardExample.mapper.BoardMapper;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class BoardDetailService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(Integer num, Model model) {
		BoardDTO dto = boardMapper.selectOne(num);
		model.addAttribute("dto", dto);
	    // request.setAttribute("dto", dto);
	}
}
