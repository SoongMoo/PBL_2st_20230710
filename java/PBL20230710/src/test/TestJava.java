package test;

public class TestJava {
	public static void main(String [] args) {
		System.out.println("1 : 리스트 | 2 : 검색 : 3 : 수정");
		// 리터널 : 자연어 : 한글, 일어, 영어,..., 
		//        		  문자 : 한글자 (김, a)
		//                문자열: 한글자 이상(김, 김이, a, ab)
		//        자연수 : 정수 : 10 , 5
		//               실수 : 10.2, 0.5
		int i = 20;
		int j = 10;   // 초기화
		int 이숭무 = 12;
		int ij;  // ij는 정수만 저장할께요 : 변수선언
		ij = 100; // 대입
		System.out.println(i + ij);
		ij = 200; // 대입
		System.out.println(i + ij);
		byte b = 127;
		System.out.println(b);
		b = -128;
		System.out.println(b);
		short s = 32000;
		s = -32000;
		i = 2100000000;
		i = 2100000000;
		long l = 2100000000l;
		// byte  ==> short ===> char ===> int ===> long
		// char는 문자를 대입하는 변수로 사용
		char ch = 88; // short
		System.out.println(ch);
		ch = 120; // short
		System.out.println(ch);
		
		ch = 'X';
		System.out.println(ch);
		
		int ii = 100;
		int i1 = ii;
		System.out.println(i1);
		char iii = 'i';
		System.out.println(iii);
	}
}
