package dependencyTest3.main;

import java.util.Scanner;

import dependencyTest3.command.BoardCommand;
import dependencyTest3.service.Assembler;
import dependencyTest3.service.BoardDeleteService;
import dependencyTest3.service.BoardInfoService;
import dependencyTest3.service.BoardListService;
import dependencyTest3.service.BoardModifyService;
import dependencyTest3.service.BoardWriteService;

public class App {
	//static BoardRepository boardRepository = new CachedBoardRepository();
	//static BoardPrintService boardPrintService = new BoardPrintService();
	static Assembler assembler = new Assembler();
	public static void main(String[] args) {
		// 게시판
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("명령어를 입력해주세요. ");
			String command = sc.nextLine();
			if(command.startsWith("new ")) {
				// command = "new 이숭무 안녕하세요 이제부터의존객체설명";
				//             0    1     2         3
				String [] arg = command.split(" ");
				if(arg.length != 4) {
					printHelp();
					System.out.println(); //행바뀜
					continue;
				}
				BoardCommand req = new BoardCommand();
				req.setContents(arg[3]);
				req.setSubject(arg[2]);
				req.setWriter(arg[1]);                          
				BoardWriteService action = assembler.getBoardWriteService();
				action.execute(req);
			}else if(command.startsWith("change ")){
				String [] arg = command.split(" ");
				if(arg.length != 4) {
					printHelp();
					System.out.println();
					continue;
				}
				BoardModifyService action = assembler.getBoardModifyService();
				action.execute(arg);
			}else if(command.equals("list")){
				BoardListService action = assembler.getBoardListService();
				action.execute();
			}else if(command.startsWith("info ")){
				String [] arg = command.split(" ");
				if(arg.length != 2) {
					printHelp();
					System.out.println();
					continue;
				}
				BoardInfoService action = assembler.getBoardInfoService();
				action.execute(Integer.parseInt(arg[1]));
			}else if(command.startsWith("del ")) {
				String [] arg = command.split(" ");
				if(arg.length != 2) {
					printHelp();
					System.out.println();
					continue;
				}
				BoardDeleteService action = assembler.getBoardDeleteService();
				action.execute(Integer.parseInt(arg[1]));
			}else if(command.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}else {printHelp();}
		}
	}
	public static void printHelp() {
		System.out.println();
		System.out.println("명령어 사용법");
		System.out.println("게시글 등록 : new 글쓴이 제목 내용");
		System.out.println("게시글 수정 : change 번호 변경제목 변경내용");
		System.out.println("게시글 목록 : list");
		System.out.println("게시글 상세보기 : info 번호");
		System.out.println("프로그램 종료 : exit");
	}
}
