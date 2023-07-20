package inheritance;

public class CalculatorFour2 extends Calculator2{
	public CalculatorFour2(int num1){
		super(num1);
	}
	
	public CalculatorFour2(int num1, int num2) {
		super(num1, num2); // 부모클래스의 생성자
		// TODO Auto-generated constructor stub
	}
	public void sub() {
		result = num1 - num2;
	}
	public void div() {
		result = num1 / num2;
	}
}
