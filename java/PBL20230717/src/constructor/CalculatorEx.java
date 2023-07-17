package constructor;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator ex = new Calculator();
		ex.setData(10, 3);
		int result = ex.add();
		System.out.println(result);
		result = ex.sub();
		System.out.println(result);
	}
}
