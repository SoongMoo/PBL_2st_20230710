package test;

public class Integer2 {
	public static void main(String [] args) {
		//   1         2        2     4       8
		/// byte ==> short => char=> int => long
		// ascii  : 0 ~ 127
		// unicode : 256 ~ 65000
	// 정수형
		int i = -100;
		System.out.println((char)i);
		// 음수 값을 넣을 수 없다.
		//char ch = -100;
	//  문자형
		char ch = 66; 
	// ascii또는 unicode에 해당하는 문자 출력
		System.out.println(ch); 
		ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		ch = '이';
		System.out.println((int) ch);
	// char : unside
		ch = '김';
		System.out.println((int) ch);
		char ch1 = 'i';
	// 리터널 : 자연어 : 한글 , 영어, 일본어,...
	// 	             : 문자 : 'a', '이', a(x) 
	//               : 문자열 : "a"
		int 이숭무 = 10;
		System.out.println(이숭무);
		ch = 66;
		System.out.println(ch);
		/*
		ch = '\u0042';
		System.out.println(ch);
		*/
		//16
		//0000|0000|0001|0000
		//  0    0    1    0
	}
}