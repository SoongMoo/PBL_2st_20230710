package loopexample;

import java.util.Scanner;

public class ForWhileExample {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 곱을 입력해주세요 : ");
		int startGop = sc.nextInt();
		System.out.print("마지막 곱을 입력해주세요 : ");
		int endGop = sc.nextInt();
		
		for(int i = startGop; i <= endGop ; i++ ) {
			System.out.println("5  * " + i + " = " + (5 * i));
		}
		
		int i = startGop;
		while(i <= endGop) {
			System.out.println("5  * " + i + " = " + (5 * i));
			i++;
		}
	}
}
