package test;

public class ImplicitConversion {
	public static void main(String[] args) {
		// 자동형 변환 : 작은 크기가 큰 크기가 되는 것
		int i = 10;
		long l = i; // 4byte => 8byte : 자동형변환
		double d = l;
		System.out.println(d);
		short s1 = 10000;
/*
* byte ===> short  
*           char  ==> int ==> long ==> float => double
* 정수는 실수가 될수 있다.
*/
		// 강제 형변환 : 명시적형 변환
		short s = 32767;
		byte b = (byte)s;  // -1
		System.out.println(b);
		int ii1 = (int)10.5;
		System.out.println(ii1);
		double dNum = 1.2;
		float fNum = 0.9F;
		int result = (int)dNum + (int)fNum;
		System.out.println(result);
		result = (int)(dNum + fNum);
		System.out.println(result);
	}
}
