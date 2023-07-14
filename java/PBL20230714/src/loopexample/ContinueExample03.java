package loopexample;

public class ContinueExample03 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 합을 구하시오.
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1부터 100까지의 합은 "+sum+"입니다." );
		// 짝수의 합을 구하시오.
		sum = 0 ;
		i = 0;
		while(i <= 99) {
			i++;
			if(i % 2 != 0)continue;
			sum += i;
			
		}
		System.out.println("1부터 100까지의 합은 "+sum+"입니다." );
		// 홀수의 합을 구하시오.
		sum = 0;
		i = 0;
		while(i <= 99) {
			i++;
			if(i % 2 == 0)continue;
			sum += i;
		}
		System.out.println("1부터 100까지의 합은 "+sum+"입니다." );
	}

}
