package string;

public class StringTest1 {
	public static void main(String [] args) {
		int i = 10;
		double d = 10.0;
		boolean b = true;
		char ch = 'A';
		
		String str = "이숭무"; //static 주소: 상수 풀
		String str1 = "이숭무";
		if(str1 == str1)System.out.println("같다");
		
		String str2 = new String("이숭무"); // 힙영역 
		String str3 = new String("이숭무"); // 힙영역
		if(str2 == str3)System.out.println("같다");
		else System.out.println("다르다");
		
		if(str.equals(str1))System.out.println("같다");
		if(str2.equals(str3))System.out.println("같다");
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		String androidStr = new String("android");
		str3 = str3.concat(androidStr);
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
		
		str2 = str2 + androidStr;
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));
	}	
}
