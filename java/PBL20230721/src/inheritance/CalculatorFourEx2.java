package inheritance;

public class CalculatorFourEx2 {
	public static void main(String[] args) {
		CalculatorFour ex = new CalculatorFour(10, 30);
		ex.div(); // 10 / 30
		int result = ex.print();
		System.out.println(result);
		
		CalculatorFour ex2 = new CalculatorFour(30, 0);
		ex2.div();// 30 / 0 :   
		result = ex2.print(); 
		System.out.println(result);
		
		CalculatorFour ex1 = new CalculatorFour(0, 30);
		ex1.div(); // 0 / 70 : 부정 
		result = ex1.print(); 
		System.out.println(result);	
	}
}