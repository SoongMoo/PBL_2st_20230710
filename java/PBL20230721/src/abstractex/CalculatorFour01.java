package abstractex;

public class CalculatorFour01 extends CalculatorAbstract01{
	public CalculatorFour01(int num1, int num2) {
		super(num1, num2);
	}
	@Override
	public void add() {
		result = num1 + num2;
	}
	@Override
	public void div() {
		if(num2 == 0) result = 0;
		else result = num1 / num2;
	}
}
