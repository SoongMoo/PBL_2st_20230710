package abstractex;

public class Calculator01 extends Calculator {
	@Override
	public void add(int num1, int num2) {
		result = num2 + num1;
	}
	@Override
	public void div(int num1, int num2) {
		if(num2 == 0) 
			System.out.println("num2가 0이라 나눌 수 없음");
		else
			result = num1 / num2;
	}
}
