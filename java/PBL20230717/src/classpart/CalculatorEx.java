package classpart;

import javax.annotation.processing.SupportedSourceVersion;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator  cal = new Calculator();
		cal.setData(20, 10);
		System.out.println(cal.add());
		System.out.println(cal.sub());
		System.out.println(cal.mul());
		System.out.println(cal.div());
		
		System.out.println(cal.getNum1());
		System.out.println(cal.getNum2());
	}
}
