package cooperation;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int i = 10;
		cal.setData(i, 2);
		cal.add();
		int result = cal.result();
		System.out.println(result);
		cal.num();
		System.out.println(cal.num1);
		System.out.println(i);
	}
}