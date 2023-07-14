package loopexample;

public class ContinueExample01 {

	public static void main(String[] args) {
		// 5단
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println("5 * " + i + " = " + (5 * i));
		}
		// 홀수만 출력 
		for(int i = 1 ; i <= 9 ; i += 2) {
			System.out.println("5 * " + i + " = " + (5 * i));
		}
		for(int i = 1 ; i <= 9 ; i++) {
			if(i % 2 == 0) continue;
			System.out.println("5 * " + i + " = " + (5 * i));
		}
		// 짝수만 출력
		for(int i = 1 ; i <= 9 ; i++) {
			if(i % 2 != 0) continue;
			System.out.println("5 * " + i + " = " + (5 * i));
		}
		
	}

}
