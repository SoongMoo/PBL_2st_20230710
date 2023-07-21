package abstractex;

public abstract class CalculatorAbstract01 {
	final int MAX_VAL = 100; // 상수
	final static int MIN_VAL = 100; // 상수
	int num1;
	int num2;
	int result;
	public CalculatorAbstract01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public abstract void add();
	public abstract void div();
	public void sub() {
		result = num1 - num2;
	}
	public void mul() {
		result = num1 * num2;
	}
	final public void print() {
		System.out.println(result);
	}



	
	
	
}
