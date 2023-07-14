package loopexample;

import java.util.Scanner;

public class WhileExample05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("시작 수를 입력하시오. : "); 
			int startNum = sc.nextInt();
			System.out.println("마지막 수를 입력하시오. : ");
			int endNum = sc.nextInt();
			int sum = 0;
			int i = startNum;
			while(i <= endNum) {
				sum += i;
				i++;
			}
			System.out.println("1 ~ 10 까지의 합은 "+ sum + "입니다.");
			System.out.println("계속하려면 'y' 또는 'Y'를 ");
			sc.nextLine();
			String ch = sc.nextLine();
			if(!(ch.equals("y") || ch.equals("Y"))) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
	}

}
