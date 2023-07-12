package ifexample;

public class IfExample5 {

	public static void main(String[] args) {
		// IfExample2예제를 아래 처럼 변경
		// 100~90:A , 89 ~ 80 : B, 79~70:C, 69~60 : D, 59이하 :F
		// if ~ else if ~ else ===> if ~ else
		int score = 75;
		if (score >= 90) {
			System.out.println("A");
		}else {
			if(score >= 80) {
				System.out.println("B");
			}else {
				if(score >= 70) {
					System.out.println("C");
				}else {
					if(score >= 60) {
						System.out.println("D");
					}else {
						System.out.println("F");
					}
				}
			}
		}
	}

}
