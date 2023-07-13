package ifexample;

public class SwitchCase2 {
	public static void main(String[] args) {
		/*
		String num = new String("031");
		String num1 = new String("031");
		int i = 10;
		int j = 10;
		double d = 0.5;
		double e = 0.5;
		char ch = 'a';
		char ch1 = 'a';
		System.out.println(ch == ch1);
		System.out.println(d == e);
		System.out.println(i == j);
		System.out.println(num.equals(num1));
		*/
		String num = "031";
		String location ="";
		if (num.equals("02")) {
			location = "서울";
		}else if(num.equals("031")) {
			location = "경기도";
		}else if(num.equals("032")) {
			location = "인천";
		}else if(num.equals("051")) {
			location = "부산";
		}else if(num.equals("052")) {
			location = "울산";
		}else {
			location = "다른 지역";
		}
		System.out.println("해당 지력은 " + location + "입니다." );
		
		// switch 
		switch(num) {
		case "02": 
			location = "서울"; 
			System.out.println("해당 지력은 " + location + "입니다." );break;
		case "031":
			location = "경기"; 
			System.out.println("해당 지력은 " + location + "입니다." );break;
		case "032":
			location = "인천"; 
			System.out.println("해당 지력은 " + location + "입니다." );break;
		case "051":
			location = "부산"; 
			System.out.println("해당 지력은 " + location + "입니다." );break;
		case "052":
			location = "울산";
			System.out.println("해당 지력은 " + location + "입니다." );break;
		default :
			location ="다른 지역"; 
			System.out.println("해당 지력은 " + location + "입니다." );
		}
		
	}
}
