package inheritance;

public class CalculatorFourEx1 {

	public static void main(String[] args) {
		CalculatorFour ex = new CalculatorFour(10, 20);
		Calculator ex1 = ex;
		// ex1.mul();
		ex1.add();
		int result = ex1.print();
		System.out.println(result);
		CalculatorFour ex2 = (CalculatorFour) ex1;
		ex2.mul();
		CalculatorFour ex3 =(CalculatorFour) new Calculator(30, 20);
		ex3.mul();
	}
}
