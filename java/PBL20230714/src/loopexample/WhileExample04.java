package loopexample;

import java.util.Scanner;

public class WhileExample04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("처음 수를 입력하시오 : ");
		int startNum = sc.nextInt();
		System.out.print("마지막 수를 입력하시오 : ");
		int endNum = sc.nextInt();
		int sum = 0;
		int i = startNum;
		while(i <= endNum) {
			sum += i;
			i++;
		}
		System.out.println(startNum + " ~ "+ endNum 
						+ "까지의 합은 " + sum + "입니다");
	}

}
