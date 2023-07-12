package valiable;

public class ValiableEx1 {

	public static void main(String[] args) {
		int intValue = 10;
		
		double dNum = intValue; // 지동형변환
		
		double doubleValue = 5.5;
		
		double result = dNum + doubleValue;
		System.out.println(result);
		result = intValue + doubleValue;
		//       정수 => 실수 : 자동형변환
		// double = double + double
		System.out.println(result);
	}
}
