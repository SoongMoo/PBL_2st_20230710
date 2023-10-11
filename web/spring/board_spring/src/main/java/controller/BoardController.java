package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import command.BoardCommand;
import service.BoardDelService;
import service.BoardDetailService;
import service.BoardModifyService;
import service.BoardWriteService;
import service.BoardListService;

@Controller
public class BoardController {
	@Autowired
	BoardListService boradListService;
	@Autowired
	BoardDetailService boardDetailService;
	@Autowired
	BoardWriteService boardWriteService;
	@Autowired
	BoardDelService boardDelService;
	@Autowired
	BoardModifyService boardModifyService;
	@RequestMapping("boardList")
	public String boardList(Model model) {
		boradListService.execute(model);
		return "boardList";
	}
	@RequestMapping(value="boardWrite",method=RequestMethod.GET)
	public String boardWrite() {
		return "boardForm";
	}
	@RequestMapping(value="boardRegist", method=RequestMethod.POST)
	public String boardRegist(BoardCommand boardCommand) {
		boardWriteService.execute(boardCommand);
		return "redirect:boardList";
	}
	@GetMapping("boardDetail")
	public String boardDetail(@RequestParam(value="num") String num,
			Model model) {
		boardDetailService.execute(num, model);
		return "boardInfo";
	}
	@GetMapping("boardUpdate")
	public String boardUpdate(@RequestParam(value="num") String num,
			Model model) {
		boardDetailService.execute(num, model);
		return "boardModifyForm";
	}
	@PostMapping("boardModify")
	public String boardModify(BoardCommand boardCommand) {
		boardModifyService.execute(boardCommand);
		return "redirect:boardDetail?num="+boardCommand.getBoardNum();
	}
	@RequestMapping(value="boardDel" ,method = RequestMethod.GET)
	public String boardDel(@RequestParam(value="num") String num) {
		boardDelService.execute(num);
		return "redirect:boardList";
	}
}
