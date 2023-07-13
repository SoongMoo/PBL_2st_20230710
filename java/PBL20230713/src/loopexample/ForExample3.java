package loopexample;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		System.out.println(dan + " * 1 = " + dan * 1);
		
		for(int gop = 1; gop <= 9 ; gop++ ) {
			System.out.println(dan + " * " + gop + " = " + dan * gop);		
		}
	}
}
