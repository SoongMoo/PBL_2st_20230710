package dependencyTest1.main;

import java.util.Scanner;

import dependencyTest1.command.BoardCommand;
import dependencyTest1.service.BoardListService;
import dependencyTest1.service.BoardWriteService;

public class App {
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
				BoardWriteService action = new BoardWriteService();
				action.execute(req);
			}else if(command.startsWith("change ")){
			}else if(command.startsWith("list")){
				BoardListService action = new BoardListService();
				action.execute();
			}else if(command.startsWith("info ")){
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
		System.out.println("게시글 수정 : change 번호 내용 변경내용");
		System.out.println("게시글 목록 : list");
		System.out.println("게시글 상세보기 : info 번호");
		System.out.println("프로그램 종료 : exit");
	}
}
