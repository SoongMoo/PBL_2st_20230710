package loopexample;

public class ForExample5 {

	public static void main(String[] args) {
		/// 1 ~ 10까지 더한값을 구하시오.
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		System.out.println("sum = " + sum);
		
		sum = 0;
		for (int num = 1; num <= 10; num++) {
			sum = sum + num;
		}
		System.out.println("sum = " + sum);
		

	}

}
