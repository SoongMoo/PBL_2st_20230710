package inheritance;

public class CalculatorFour extends Calculator{
	public CalculatorFour(int num1, int num2) {
		super(num1, num2); // 부모 생성자
		System.out.println("자식 클래스 CalculatorFour 실행");
	}
	public CalculatorFour(int num1) {
		super(num1);
	}
	public void sub() {
		result = num1 - num2;
	}
	public void mul() {
		result = num1 * num2;
	}
	// @: annotation
	@Override // 재정의
	public void div() {
		if(num2 == 0) {
			result = 0;
		}else {
			result = num1 / num2;
		}
	}
	
	public void div1() {
		super.div();
	}
	
	
}
