package cooperation;

public class StringEx {

	public static void main(String[] args) {
		String str ="이숭무";
		String str1 = "이숭무";
		if(str == str1) {
			System.out.println("같다");
		}
		String str2 = new String("이숭무");
		String str3 = new String("이숭무");
		if(str2 == str3) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(str2.equals(str3)){System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
