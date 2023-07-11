package test;

import java.util.Scanner;

public class Variable2 {
	public static void main(String [] args) {
		int i = 10;
		System.out.println(i);
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요.");
		System.out.println(sc.nextInt() + sc.nextInt());
	//  자료형  변수명
		int     j ; // 변수 선언
	// 변수명 = 값
		j = 20; // 대입
		System.out.println(j);
		
		int z;
	// 변수명     값 
		z    =    i;
		i    =    j;
		System.out.println(i);
		int y = 40; // 초기화
		// 다른 특수문자는 첫 글자로 사용 할 수 없다.
		// 숫자도 첫 글자로 사용 할 수 없다.
		int $a;
		int _a;
	}
}
