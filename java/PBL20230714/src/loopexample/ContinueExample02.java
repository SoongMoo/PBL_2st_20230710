package loopexample;

public class ContinueExample02 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 합을 구하시오.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 "+sum+"입니다." );
		// 짝수의 합을 구하시오.
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0 )continue;
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 "+sum+"입니다." );
		//  홀수의 합을 구하시오
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0)continue;
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 "+sum+"입니다." );
		
	}
}
