package loopexample;

public class ForExample2 {

	public static void main(String[] args) {
		System.out.println("5 * 1 = 5");
		System.out.println("5 * 2 = 10");
		System.out.println("5 * 3 = 15");
		System.out.println("5 * 4 = 20");
		System.out.println("5 * 5 = 25");
		System.out.println("5 * 6 = 30");
		System.out.println("5 * 7 = 35");
		System.out.println("5 * 8 = 40");
		System.out.println("5 * 9 = 45");
		
		for(int gop = 1; gop <= 9 ; ++gop) {
			System.out.println("5 * " + gop + " = " + 5*gop);
		}
		
	}

}
