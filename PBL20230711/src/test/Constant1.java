package test;

public class Constant1 { // MinValueNum
	public static void main(String [] args) {
		// 상수면은 모두 대문자로 쓰자
		final int MIN_VALUE = 100; // MIN_VALUE_NUM
		final int MAX_VALUE = 1000;
		// 리터널(상수) : 자연어 : 문자, 문자열
		//             자연수 : 정수, 실수
		//             논 리 : 참 , 거짓
		// 변수와 상수의 차이 : 수학
		// 상수 : 의미가 변하는 않는 수
		// 리터널과 상수
		int i1 = 10;
		i1 = 20;
		// 리터널 값이 바뀌지 않는 것
		final int II = 100; // 상수
		// II = 200;0
		System.out.println(II);
		for (int i = MIN_VALUE ; i <= MAX_VALUE ; i++) {
			System.out.println(i);
		}
		for (int i = MIN_VALUE ; i <= MAX_VALUE ; i++) {
			System.out.println(i);
		}
		for (int i = MIN_VALUE ; i <= MAX_VALUE ; i++) {
			System.out.println(i);
		}
		int minValueNum; // 약속
		// 권장하지 않는다.
		final int III;
		III = 1000;
		System.out.println(III);
	}
}