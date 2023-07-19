package cooperation;

public class Calculator {
	int num1;
	int num2;
	int num3;
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {
		num3 = num1 + num2;
	}
	public void sub() {
		num3 = num1 - num2;
	}
	public void num() {
		num1 = 100;
	}
	public int result() {
		return num3;
	}
}