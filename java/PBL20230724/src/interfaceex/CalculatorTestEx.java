package interfaceex;

public class CalculatorTestEx {

	public static void main(String[] args) {
		Calculator01 ex = new Calculator01();
		System.out.println(ex.add(10, 20));
		System.out.println(ex.substract(20, 10));
		CompleteCalc ex1 = new CompleteCalc();
		System.out.println(ex1.divide(10, 20));
		System.out.println(ex1.add(10, 20));
		Calc c = new CompleteCalc();
		Calc.total(new int[] {1,2,3,4});
		
	}

}
