package ifexample;

public class IfExample6 {
	public static void main(String[] args) {
		// 100~95:A+ 94~90:A , 89 ~ 85 : B+ , 84 ~ 80 : B, 
		// 79~75:C+ 74~70 : C, 69~65 : D+ 64 ~ 60 : D, 59이하 :F
		// if ~ else if ~ else
		int score = 79;
		boolean result;
		if (score >= 90) {
			if(score >= 95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
		} else if (score >= 80) {
			if(score >= 85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
		} else if (score >= 70) {
			if(score >= 75) {
				System.out.println("C+");
			}else {
				System.out.println("C");
			}
		} else if (score >= 60) {
			if(score >= 65) {
				System.out.println("D+");
			}else {
				System.out.println("D");
			}
		} else {
			System.out.println("F");
		}
	}
}
