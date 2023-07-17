package loopexample;

import java.util.Scanner;

public class LoopExample02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			// 1~100까지의 합계
			System.out.print("시작 숫자를 입력해주세요... : ");
			int startNum = sc.nextInt();
			System.out.print("마지막 숫자를 입력해주세요... : ");
			int endNum = sc.nextInt();
			int sum = 0;
			for(int i = startNum ; i <= endNum ; i++) {
				sum += i;
			}
			System.out.println("1 ~ 100까지의 합은 : " + sum);
			sc.nextLine(); 
			System.out.println("계속하려면 아무키나 중지하려면 'y");
			String stop = sc.nextLine();
			if(stop.equals("y")||stop.equals("Y")) {
				System.out.println("프로그램 종료.");
				System.exit(0);//break;
			}
		}
	}
}
