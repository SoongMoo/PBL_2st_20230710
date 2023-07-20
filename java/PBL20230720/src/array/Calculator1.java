package array;
public class Calculator1 {
	protected int num1;
	protected int num2;
	protected int result;
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