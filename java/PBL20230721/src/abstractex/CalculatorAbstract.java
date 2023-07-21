package abstractex;

public abstract class CalculatorAbstract {
	
	int result;
	public abstract void add(int num1, int num2);
	public abstract void div(int num1, int num2);
	
	public void sub(int num1 , int num2) {
		result = num1 - num2;
	}
	public void mul(int num1, int num2) {
		result = num1 * num2;
	}
}
