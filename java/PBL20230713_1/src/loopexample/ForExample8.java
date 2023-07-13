package loopexample;

import java.util.Scanner;

public class ForExample8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i;
		for(i = sc.nextInt(); i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
