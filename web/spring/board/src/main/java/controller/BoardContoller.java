package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.BoardCommand;
import service.BoardDelService;
import service.BoardDetailService;
import service.BoardModifyService;
import service.BoardWriteService;
import service.BoradListService;

@Controller

public class BoardContoller {
	@Autowired
	BoardWriteService boardWriteService;
	@Autowired
	BoardModifyService boardModifyService;
	@Autowired
	BoardDetailService boardDetailService;
	@Autowired
	BoardDelService boardDelService;
	@Autowired
	BoradListService boardListService;

	
	@RequestMapping("boardList")
	public String boardList(Model model) {
		boardListService.execute(model);
		return "boardList";
	}
	@RequestMapping(value="boardWrite" ,method = RequestMethod.GET)
	public String boardWrite() {
		return "boardForm";
	}
	@RequestMapping(value="boardDetail" ,method = RequestMethod.GET)
	public String boardDetail(Model model, @RequestParam(value = "num") String num) {
		boardDetailService.execute(num, model);
		return "boardInfo";
	}
	@RequestMapping(value="boardUpdate" ,method = RequestMethod.GET)
	public String boardUpdate(Model model, @RequestParam(value = "num") String num) {
		boardDetailService.execute(num, model);
		return "boardModifyForm";
	}
	@RequestMapping(value="boardDel" ,method = RequestMethod.GET)
	public String boardDel(@RequestParam(value = "num") String num) {
		boardDelService.execute(num);
		return "redirect:boardList";
	}
	@RequestMapping(value="boardRegist" ,method = RequestMethod.POST)
	public String boardRegist(BoardCommand boardCommand) {
		boardWriteService.execute(boardCommand);
		return "redirect:boardList";
	}
	@RequestMapping(value="boardModify" ,method = RequestMethod.POST)
	public String boardModify(BoardCommand boardCommand) {
		boardModifyService.execute(boardCommand);
		return "redirect:boardDetail?num="+boardCommand.getBoardNum();
	}
}
