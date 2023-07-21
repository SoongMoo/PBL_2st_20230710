package abstractex;

public class CalculatorFour extends CalculatorAbstract{

	@Override
	public void add(int num1, int num2) {
		result = num1 + num2;
	}

	@Override
	public void div(int num1, int num2) {
		if(num2 == 0 )result = 0;
		else result = num1 / num2;
	}

}
