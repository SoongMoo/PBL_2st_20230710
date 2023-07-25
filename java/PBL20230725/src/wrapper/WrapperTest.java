package wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		int i = 0;
		System.out.println(i);
		Integer i1 = null;
		System.out.println(i1);
		long l =0L;
		Long l1 = null;
		char ch ='A';
		Character ch1 = 'A';
		i = (int)10.5; //형변환
		//i = (int)"10";  문자열 숫자를 숫자로 변환
		i1 = Integer.parseInt("10"); // Integer
		i1 = Integer.valueOf("10");  // Integer
		i = Integer.parseInt("10");  // int
		i = Integer.valueOf("10"); // int
		
		i = i1;  // int = Integer : 언박싱
		i1 = i;  // Integer = int : 박싱
		String str = String.valueOf(10);
		
		// byte => short => int => long => float => double
		//      <=============================== 강제형변환
		String str1 = "이숭무";
		String str2 = "이숭무";
		if (str1 == str2) ; // X
		if (str1.equals(str2)) ; // O
		String str3 = "이숭무";
			   str3 += "이상범";
			   str3 += "이장범";		
	}
}
