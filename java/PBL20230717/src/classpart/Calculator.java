package classpart;

public class Calculator {
	private int num1;
	private int num2;
	//    빈공간
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		return;
	}
	
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return this.num2;
	}
	
	public int add() {
		return num1 + num2;
	}
	
	public int sub() {
		return num1 - num2;
	}
	
	public int mul() {
		return num1 * num2;
	}
	
	public int div() {
		return num1 / num2;
	}
}
