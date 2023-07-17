package classpart;

import java.util.Scanner;

public class MethodEx {

	public static void main(String[] args) {
	// 함수는 함수안에 정의 할 수 없다.	
		int result = add(10, 20);
		System.out.println(result);
		sub(10, 20); // 반환값이 없는 경우에는 함수만 호출
		result = mul();// parameter가 없어 argument를 줄수없다.
		System.out.println(result);
		div();
	}
	/// 함수의 4가지 유형
	// 1. 기본형:  입력값이 있고 출력 값(반환형)이 있는 경우
	static int add(int num1 , int num2) {
		int num3 = num1 + num2;
		return num3;
	}
	// 2. 입력 값은 있고 출력값이 없는 경우
	static void sub(int num1 , int num2) {
		int num3 = num1 - num2;
		System.out.println(num3);
	}
	// 3. 입력값은 없고 출력값이 있는 경우
	// 매개변수가 없다.
	static int mul() { 
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); 
		int num2 = sc.nextInt();
		int num3 = num1 * num2;
		return num3;
	}
	// 4. 입력값이 없고 출력값도 없다.
	static void div() {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); 
		int num2 = sc.nextInt();
		int num3 = num1 / num2;
		System.out.println(num3);		
	}
}