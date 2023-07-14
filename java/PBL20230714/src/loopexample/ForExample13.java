package loopexample;

public class ForExample13 {

	public static void main(String[] args) {
		System.out.println(" 5 * 9 = 45");
		System.out.println(" 5 * 8 = 40");
		System.out.println(" 5 * 7 = 35");
		System.out.println(" 5 * 6 = 30");
		System.out.println(" 5 * 5 = 25");
		System.out.println(" 5 * 4 = 20");
		System.out.println(" 5 * 3 = 15");
		System.out.println(" 5 * 2 = 10");
		System.out.println(" 5 * 1 = 5");
		System.out.println();
		for(int i = 9; i >= 1; i--) {
			System.out.println(" 5 * " + i + " = " + (5 * i));
		}

	}

}
