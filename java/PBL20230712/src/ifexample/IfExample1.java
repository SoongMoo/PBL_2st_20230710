package ifexample;

public class IfExample1 {

	public static void main(String[] args) {
		// 100~90:A , 89 ~ 80 : B, 79~70:C, 69~60 : D, 59이하 :F
		int score = 79;
		boolean result;
		result = score >= 90 && score <= 100;
		if(result) {
			System.out.println("A");
		}
		result = score >= 80 && score <= 89;
		if(result) {
			System.out.println("B");
		}
		result = score >= 70 && score <= 79;
		if(result) {
			System.out.println("C");
		}
		result = score >= 60 && score <= 69;
		if(result) {
			System.out.println("D");
		}
		result = score < 60;
		if(result) {
			System.out.println("F");
		}
	}

}
