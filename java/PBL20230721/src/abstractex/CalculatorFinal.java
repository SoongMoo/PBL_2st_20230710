package abstractex;

public final class CalculatorFinal {
	int num1;
	int num2;
	int result;
	public CalculatorFinal(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {
		result = num1 + num2;
	}
	public void div() {
		result = num1 / num2;
	}
}
