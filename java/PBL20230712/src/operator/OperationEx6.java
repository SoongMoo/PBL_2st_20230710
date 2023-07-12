package operator;

public class OperationEx6 {
	public static void main(String[] args) {
		// 논리(참/거짓) 연산 (and &&  , or || )
		System.out.println(true && true);
		System.out.println(false || true);
		int num1 = 10;
		int i = 2;
		boolean result;
		result = num1 < 10 && i < 10;
		
		if(result) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		if(num1 < 10 && i < 10) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
	} 
}
