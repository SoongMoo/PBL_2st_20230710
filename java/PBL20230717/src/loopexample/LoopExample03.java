package loopexample;

import java.util.Scanner; // API

public class LoopExample03 {

	public static void main(String[] args) {
		String stop = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("시작 숫자를 입력해주세요... : ");
			int startNum = sc.nextInt();
			System.out.print("마지막 숫자를 입력해주세요... : ");
			int endNum = sc.nextInt();
			int sum = 0;
			for(int i = startNum ; i <= endNum ; i++) {
				sum += i;
			}
			System.out.println("1 ~ 100까지의 합은 : " + sum);
			sc.nextLine(); /// 버퍼에 있는 값을 지우기 위해
			System.out.println("계속하려면 아무키나 종료하려면 'y'");
			stop = sc.nextLine();
			if(stop.equals("y") || stop.equals("Y")) {
				System.out.println("프로그램 종료");
			}
		}while(!(stop.equals("y") || stop.equals("Y")));
	}
}