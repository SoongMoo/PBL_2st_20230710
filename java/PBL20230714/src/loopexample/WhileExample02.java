package loopexample;

public class WhileExample02 {
	public static void main(String[] args) {
		// 1 ~ 10까지 합을 구하시오
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
		System.out.println("1 ~ 10까지의 합은 " + sum + "입니다");
		sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("1 ~ 10까지의 합은 " + sum + "입니다");
	}
}