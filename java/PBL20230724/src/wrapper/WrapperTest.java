package wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		int i = 10;
		Integer i1 = 10;
		long l = 10;
		Long l1 = 10L;
		char ch = 'A';
		Character ch1 = 'A';
		float f = 10.5f;
		Float f1 = 10.5F;
		double d = 10.5;
		Double d1 = 10.5;
		boolean b = true;
		Boolean b1 = true;
		
		String str = Integer.toString(i1);
		System.out.println(str);
		str = Long.toString(l1);
		str = String.valueOf(l1);
		System.out.println(str);
		str = String.valueOf(d1);
		
		
		l = Long.parseLong("10");
		f = Float.parseFloat("10.5");
		d = Double.parseDouble("10.5");
		b1 = Boolean.parseBoolean("true");
				
		Integer num1 = 100;
		int num2 = 200;
		int sum = num1 + num2;
		
	}
}
