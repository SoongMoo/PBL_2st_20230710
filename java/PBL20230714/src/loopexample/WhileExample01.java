package loopexample;

public class WhileExample01 {
	public static void main(String[] args) {
		// 5단
		int gop = 1;
		while(gop <= 9) {
			System.out.println("5 * " + gop + " = " + (5 * gop));
			gop++;
		}
		// 6단
		gop = 1;
		while(gop <= 9) {
			System.out.println("6 * " + gop + " = " + (6 * gop));
			gop++;
		}
		// 7단
		gop = 1;
		while(gop <= 9) {
			System.out.println("7 * " + gop + " = " + (7 * gop));
			gop++;
		}
		System.out.println();
		int dan = 5;
		while(dan <= 7) {
			gop = 1;
			while(gop <= 9) {
				System.out.println(dan + " * " + gop + " = " + (dan * gop));
				gop++;
			}
			dan++;
		}
	}
}
