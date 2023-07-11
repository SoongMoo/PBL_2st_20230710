package test;

import java.util.Scanner;
public class Variable1 {
	/// 메서드는 클래스 안에 있어야 한다.
	/// 코딩은 메서드안에 한다.
	public static void main(String [] args) {
		System.out.println("hello java");
		System.out.println(10 + 20);
		// API(APplication Interface)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int i = sc.nextInt();
		System.out.print("정수를 입력해주세요 : ");
		int j = sc.nextInt();
		System.out.println(i + j);
	}
}