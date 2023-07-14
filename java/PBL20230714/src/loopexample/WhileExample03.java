package loopexample;

public class WhileExample03 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		for( ;i <= 10 ; i++) {
			sum += i; // sum = sum + i
		}
		System.out.println("1 ~ 10까지의 합은 " + sum + "입니다");
		sum = 0;
		i = 1;
		for(;;) {
			if(i > 10) break;
			sum += i;
			i++;
		}
		System.out.println("1 ~ 10까지의 합은 " + sum + "입니다");
		sum = 0;
		i = 1;
		while(true) {
			if(i > 10) break;
			sum += i;
			i++;
		}
	}

}
