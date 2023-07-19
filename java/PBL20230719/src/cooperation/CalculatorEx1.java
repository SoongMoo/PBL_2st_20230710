package cooperation;

public class CalculatorEx1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.setData(10, 20);
		System.out.println(cal.num3);
		
		Calculator1 cal1 = new Calculator1();
		cal1.setCal(cal);
		cal1.getCal().add();
		System.out.println(cal.num3);
		cal1.getCal().num();
		System.out.println(cal.num1);
	}
}
