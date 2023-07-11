package test;

public class Double1 {
	public static void main(String [] args) {
		// 0.00001 => 1.0 * 10^-5
		// 0.00002 => 2.0 * 10^-5
		// 00000000 00000000 00000000 00000000
		//  정수          지수  
		float  f; // 4byte 
		double d; // 8byte
		// 자바는 실수를 8byte로 처리
		f = 3.1415921212122F;
		d = 3.141592121212212123;
		System.out.println(f); // 소수점이하 6자리
		System.out.println(d); // 소수점이하 17자리
		//정수 : int, long
		//실수 : double
		//문자 : char
	}
}
