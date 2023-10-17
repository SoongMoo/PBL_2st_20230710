package dependencyTest4.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import dependencyTest4.command.BoardCommand;
import dependencyTest4.service.BoardDeleteService;
import dependencyTest4.service.BoardInfoService;
import dependencyTest4.service.BoardListService;
import dependencyTest4.service.BoardModifyService;
import dependencyTest4.service.BoardWriteService;

public class AppController {
	@Autowired
	BoardWriteService boardWriteService;
	@Autowired
	BoardModifyService boardModifyService;
	@Autowired
	BoardListService boardListService;
	@Autowired
	BoardInfoService boardInfoService;
	@Autowired
	BoardDeleteService boardDeleteService;
	public void run() {
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
				boardWriteService.execute(req);
			}else if(command.startsWith("change ")){
				String [] arg = command.split(" ");
				if(arg.length != 4) {
					printHelp();
					System.out.println();
					continue;
				}
				boardModifyService.execute(arg);
			}else if(command.equals("list")){
				boardListService.execute();
			}else if(command.startsWith("info ")){
				String [] arg = command.split(" ");
				if(arg.length != 2) {
					printHelp();
					System.out.println();
					continue;
				}
				boardInfoService.execute(Integer.parseInt(arg[1]));
			}else if(command.startsWith("del ")) {
				String [] arg = command.split(" ");
				if(arg.length != 2) {
					printHelp();
					System.out.println();
					continue;
				}
				boardDeleteService.execute(Integer.parseInt(arg[1]));
			}else if(command.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}else {printHelp();}
		}
	}
	public void printHelp() {
		System.out.println();
		System.out.println("명령어 사용법");
		System.out.println("게시글 등록 : new 글쓴이 제목 내용");
		System.out.println("게시글 수정 : change 번호 변경제목 변경내용");
		System.out.println("게시글 목록 : list");
		System.out.println("게시글 상세보기 : info 번호");
		System.out.println("프로그램 종료 : exit");
	}
}
