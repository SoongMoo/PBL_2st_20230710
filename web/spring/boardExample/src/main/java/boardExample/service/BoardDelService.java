package boardExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boardExample.mapper.BoardMapper;

@Service
public class BoardDelService {
	@Autowired
	BoardMapper boardMapper;
	public void execute(Integer num) {
		boardMapper.boardDel(num);
	}
}
