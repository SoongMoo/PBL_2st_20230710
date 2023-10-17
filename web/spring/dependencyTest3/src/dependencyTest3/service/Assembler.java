package dependencyTest3.service;

import dependencyTest3.Repository.BoardRepository;
import dependencyTest3.Repository.CachedBoardRepository;

public class Assembler {
	BoardRepository boardRepository;
	BoardPrintService boardPrintService;
	BoardDeleteService boardDeleteService;
	BoardInfoService boardInfoService;
	BoardListService boardListService;
	BoardModifyService boardModifyService;
	BoardWriteService boardWriteService;
	public Assembler() {
		boardRepository = new CachedBoardRepository();
		boardPrintService = new BoardPrintService();
		boardDeleteService = new BoardDeleteService(boardRepository);
		boardInfoService = new BoardInfoService(boardRepository, boardPrintService);
		boardListService = new BoardListService(boardRepository, boardPrintService);
		boardModifyService = new BoardModifyService(boardRepository);
		boardWriteService = new BoardWriteService(boardRepository);
	}
	
	
	public BoardRepository getBoardRepository() {
		return boardRepository;
	}
	public BoardPrintService getBoardPrintService() {
		return boardPrintService;
	}

	public BoardDeleteService getBoardDeleteService() {
		return boardDeleteService;
	}

	public BoardInfoService getBoardInfoService() {
		return boardInfoService;
	}

	public BoardListService getBoardListService() {
		return boardListService;
	}

	public BoardModifyService getBoardModifyService() {
		return boardModifyService;
	}

	public BoardWriteService getBoardWriteService() {
		return boardWriteService;
	}
	
}
