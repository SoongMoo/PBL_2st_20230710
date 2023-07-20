package inheritance;

public class CalculatorFour1Ex {

	public static void main(String[] args) {
		CalculatorFour1 calc = new CalculatorFour1();
		calc.add(10, 20);
		/// 멤버 필드가 접근지정자가 prodected이기 때문에 접근할 수 없다.
		System.out.println(calc.result);
	}

}
