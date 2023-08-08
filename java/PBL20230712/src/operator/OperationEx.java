package operator;

public class OperationEx {
	public static void main(String[] args) {
		// 항과 연산자
		double i;
		i = 10.0;
		// 이항연산자 : 사직연산 ( +, -, *, /, % )
		System.out.println(i + 3);
		double j = 3.0;
		
		System.out.println(i / j);
		// 몫 
		System.out.println(i % j);
		//  나머지
		System.out.println((int)i / (int)j);
		System.out.println((int)(10.0 / 3.0 ));
		System.out.println((int)( i   /  j  ));
	}
}
