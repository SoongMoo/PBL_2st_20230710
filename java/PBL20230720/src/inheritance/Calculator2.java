package inheritance;

public class Calculator2 {
	int num1;
	int num2;
	int result;
	public Calculator2(int num1) {
		this.num1 = num1;
		num2 = 10;
	}
	public Calculator2(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {
		this.result = this.num1 + this.num2;
	}
	public void div() {
		this.result = this.num1 / this.num2;
	}
}
