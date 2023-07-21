package abstractex;

public class Calculator02 extends Calculator {
	@Override
	public void add(int num1, int num2) {
		result = num1 + num2 * 3;
	}
	@Override
	public void div(int num1, int num2) {
		if(num2 == 0) result = 0;
		else result = num1 / num2;
	}
}
