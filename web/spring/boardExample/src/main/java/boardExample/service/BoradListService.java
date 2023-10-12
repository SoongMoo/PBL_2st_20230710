package boardExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import boardExample.domain.BoardDTO;
import boardExample.mapper.BoardMapper;

@Service
public class BoradListService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(Model model) {
		List<BoardDTO> list = boardMapper.selectAll();
		model.addAttribute("dtos", list);
	}
}
