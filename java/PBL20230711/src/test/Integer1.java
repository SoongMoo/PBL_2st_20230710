package test;

public class Integer1 {
	public static void main(String [] args) {
		byte b = -128;    // 1byte
		System.out.println(b);
		b = 127;
		System.out.println(b);
		short s = -32768;  // 2byte
		System.out.println(s);
		s = 32767;
		System.out.println(s);
		int i = -2147483648;  // 4byte : 정수 기본 크기
		System.out.println(i);
		i = 2147483647;
		System.out.println(i);
		long l = 12345678912L; // 8byte
		System.out.println(l);
		l = -123456778912L;
		System.out.println(l);
	}
}
