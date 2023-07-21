package abstractex;

public class CalculatorFourEx {

	public static void main(String[] args) {
		CalculatorFour ex = new CalculatorFour();
		ex.add(10, 20);
		System.out.println(ex.result);
		ex.sub(30, 10);
		System.out.println(ex.result);
	}

}
