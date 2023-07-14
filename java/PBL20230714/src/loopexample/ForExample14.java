package loopexample;

public class ForExample14 {

	public static void main(String[] args) {
		// 5단
		for(int i = 1; i <= 9; i++) {
			System.out.println("5 * " + i + " = " + (5 * i));
		}
		
		int i;
		for( i = 1; i <=9 ; i++) {
			System.out.println("5 * " + i + " = " + (5 * i));
		}
		
		int j = 1;
		for ( ; j <= 9 ; j++) {
			System.out.println("5 * " + i + " = " + (5 * i));
		}
		
		for(int k = 1 ; k <= 9 ; ) {
			System.out.println("5 * " + i + " = " + (5 * i));
			k++;
		}
		
		int k = 1;
		for( ; k <= 9 ; ) {
			System.out.println("5 * " + i + " = " + (5 * i));
			k++;
		}
		
		k = 1;
		while( k <= 9 ) {
			System.out.println("5 * " + i + " = " + (5 * i));
			k++;
		}
	}

}
