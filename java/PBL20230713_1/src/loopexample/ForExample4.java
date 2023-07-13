package loopexample;

import java.util.Scanner;

public class ForExample4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력해주세요. : ");
		int dan = sc.nextInt();
		System.out.print("시작 곱의 수를 입력하세요 : ");
		int startGop= sc.nextInt();
		System.out.print("마지막 곱의 수를 입력하세요 : ");
		int endGop = sc.nextInt();
		for(int gop = startGop; gop <= endGop ; gop++) {
			System.out.println(dan + " * " + gop +" = " + dan * gop);
		}
	}
}
