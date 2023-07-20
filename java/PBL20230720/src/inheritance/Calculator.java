package inheritance;

public class Calculator {
	int num1;
	int num2;
	int result;
	public void add(int num1 , int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = this.num1 + this.num2;
	}
	public void div(int num1 , int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = this.num1 / this.num2;
	}
}
