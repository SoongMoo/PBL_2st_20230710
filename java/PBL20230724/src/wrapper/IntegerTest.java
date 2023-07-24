package wrapper;

public class IntegerTest {
	public static void main(String[] args) {
		int i = 10;
		Integer i1 = 10;
		
		int i2 = (int)10.5 + (int)2.5;
		int i3 = Integer.parseInt("10");
		
		//int i4 = null;
		Integer i4 = null;
		if (i4 == null) {
			System.out.println("값이 어뵷어요");
		}
		int age = 10;
		String str = "이숭무의 나이는 ";
		str = str + Integer.toString(age);
		System.out.println(str);
	}
}
