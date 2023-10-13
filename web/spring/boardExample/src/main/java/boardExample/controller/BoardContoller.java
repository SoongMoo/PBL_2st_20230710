package boardExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import boardExample.command.BoardCommand;
import boardExample.service.BoardDelService;
import boardExample.service.BoardDetailService;
import boardExample.service.BoardModifyService;
import boardExample.service.BoardWriteService;
import boardExample.service.BoradListService;

@Controller
public class BoardContoller {
	//service 객체를 생성시켜준다.
	@Autowired
	BoardWriteService boardWriteService;
	@Autowired
	BoradListService boardListService;
	@Autowired
	BoardDetailService boardDetailService;
	@Autowired
	BoardModifyService boardModifyService;
	@Autowired
	BoardDelService boardDelService;
	@RequestMapping("boardList")
	public String boardList(Model model) {
		boardListService.execute(model);
		return "thymeleaf/board/boardList";
	}
	@RequestMapping(value="boardWrite" ,method = RequestMethod.GET)
	public String boardWrite() {
		return "thymeleaf/board/boardForm";
	}
	@RequestMapping(value="boardRegist" ,method = RequestMethod.POST)
	// boardForm.html에 있는 데이터를 BoardComman가 받아온다.
	public String boardRegist(BoardCommand boardCommand) {
		boardWriteService.execute(boardCommand);
		return "redirect:boardList";
	}
	@GetMapping(value="boardDetail")
	// @RequestParam(value = "num") Integer num 는
	// Integer num = Integer.parseInt(request.getParamter("num"))과 같다.
	public String boardDetail(@RequestParam(value = "num") Integer num,
			Model model) {
		boardDetailService.execute(num, model);
		return "thymeleaf/board/boardInfo";
	}
	@RequestMapping(value="boardUpdate" ,method = RequestMethod.GET)
	public String boardUpdate(@RequestParam(value = "num") Integer num,
			Model model) {
		boardDetailService.execute(num, model);
		return "thymeleaf/board/boardModifyForm";
	}
	@PostMapping("boardModify" )
	public String boardModify(BoardCommand boardCommand) {
		boardModifyService.execute(boardCommand);
		return "redirect:boardDetail?num="+boardCommand.getBoardNum();
	}
	@RequestMapping(value="boardDelete" ,method = RequestMethod.GET)
	public String boardDel(@RequestParam(value = "num") Integer num) {
		boardDelService.execute(num);
		return "redirect:boardList";
	}
}










