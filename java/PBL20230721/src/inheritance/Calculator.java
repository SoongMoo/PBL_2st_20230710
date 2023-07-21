package inheritance;

public class Calculator {
	int num1;
	int num2;
	int result;
	public Calculator(int num1 , int num2){
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("부모 클래스 Calculator 실행");
	}
	public  Calculator(int num1) {
		this.num1 = num1;
		this.num2 = 30;
	}
	public void add() {
		result = num1 + num2;
	}
	public void div() {
		result = num1 / num2;  // 30 / 0
	}
	public int  print() {
		return result;
	}
}
