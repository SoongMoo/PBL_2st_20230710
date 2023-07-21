package inheritance;

public class CalculatorFourEx {
	public static void main(String[] args) {
		CalculatorFour ex= new CalculatorFour(10, 20);
		Calculator ex1 = new CalculatorFour(20, 30);
		ex.add();
		int result = ex.print();
		System.out.println(result);
		ex.mul();
		result = ex.print();
		System.out.println(result);
		ex1.add();  
		result = ex1.print();
		System.out.println(result);
		//ex1.mul();
	}
}