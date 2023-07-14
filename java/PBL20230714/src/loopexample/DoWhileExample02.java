package loopexample;

import java.util.Scanner;

public class DoWhileExample02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.print("첫번째 숫자를 입력하시오. : ");
			int startNum = sc.nextInt();
			System.out.print("마지막 숫자를 입력하시오. : ");
			int endNum = sc.nextInt();
			int sum = 0;
			int i = startNum;
			while(i <= endNum) {
				sum += i;
				i++;
			}
			System.out.println(startNum + " ~ " + endNum
							  + "까지의 합은 " + sum + "입니다.");
			sc.nextLine();
			System.out.println("종료하려면 'y'또는 'Y'");
			str = sc.nextLine();
			if(str.equals("y")||str.equals("Y"))
				System.out.println("프로그램 종료");
		}while(!(str.equals("y")||str.equals("Y")));
	}

}
