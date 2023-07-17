package classpart;

import java.util.Scanner;

public class ClassPartEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassPart classPart = new ClassPart(); // 객체생성
		System.out.println(classPart.start);
		classPart.start = 10;
		System.out.println(classPart.start);
		System.out.println(classPart.end);
		classPart.end = 20;
		System.out.println(classPart.end);
		System.out.println(classPart.start + classPart.end);
		classPart.add();
		System.out.println(classPart.result);
		ClassPart classPart1 = new ClassPart();
		classPart1.start = 100;
		classPart1.end = 200;
		classPart1.result = 5000;
		System.out.println(classPart.start);
		System.out.println(classPart1.start);
		
		
		int i; // 변수 선언
		i = 10; // 대입
		int j = 20;
		ClassPart classPart2; // 객체 선언
		classPart2 = new ClassPart() ; // 객체 생성
		classPart2.start = 10; // 멤버변수 초기화 
	}

}
