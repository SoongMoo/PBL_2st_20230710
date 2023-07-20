package inheritance;

import array.Calculator1;

public class CalculatorFour1 extends Calculator1 {
	public void sub(int num1 , int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = this.num1 - this.num2;
	}
	public void mul(int num1 , int num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = this.num1 * this.num2;
	}
}
