package operator;

public class OperationEx1 {
	public static void main(String []     args) {
		// +, -, *, /, = 
		int i = 10; // 대입 연산자
		i = -      10; // 부호연산자
		//산술연산자 ( +, -, *, /, %)
		int i1 = 100;
		int i2 = 200;
		int result = i1 + i2;
		System.out.println(result);
		short s = 100;
		result = i1 + 10;
		///   4byte + 4byte == 4byte
		//  0000001010101
		// +0010100010001
		//=================
		System.out.println(result);
		result = i1 + s; // 100 + 100
		//    4byte + 2byte
		//    4byte + 4byte = 4byte
		//    01010101    => 01010101
		//   +    0011       00000011
		result = 10 + s; // 자동형변환
		//     4byte + 2byte
		//     4byte + 4byte = 4byte
		
		
		int iNum = 20;
		float fNum = iNum; // 자동형변환
		double dNum = fNum + iNum;
		           // 실수 + 정수 => 실수 + 실수
		           // 4byte + 4byte
				   // 8byte + 8byte = 8byte	
		// 나눈 나머지
		dNum = 10.0 / 3.0;
		System.out.println(dNum);
		result = 10 % 3; // 나머지 연산자
		System.out.println(result);
		// 10을 3으로 나눈 몫은?
		result = (int)(10.0 / 3.0);
		System.out.println(result);
	}
}
