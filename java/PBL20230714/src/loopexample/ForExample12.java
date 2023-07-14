package loopexample;

public class ForExample12 {

	public static void main(String[] args) {
		System.out.println("7 * 1 = 7");
		System.out.println("7 * 2 = 14");
		System.out.println("7 * 3 = 21");
		System.out.println("7 * 4 = 28");
		System.out.println("7 * 5 = 35");
		System.out.println("7 * 6 = 42");
		System.out.println("7 * 7 = 49");
		System.out.println("7 * 8 = 56");
		System.out.println("7 * 9 = 63");
		System.out.println();
		for(int i = 1; i <= 9 ; i++) {
			System.out.println("7 * "+ i + " = " + (7 * i));
		}
	}
}
