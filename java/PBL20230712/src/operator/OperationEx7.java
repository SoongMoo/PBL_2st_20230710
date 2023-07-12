package operator;

public class OperationEx7 {
	public static void main(String[] args) {
		// 문제  && , ||
		// 윤년과 평년을 알아보자
		int year = 2200;
		// 2220년은 윤년이면 true/ 평년이면 false
		// 윤년은 4년마다 윤년이지만 100년에는 윤년이 아니다.
		// 그렇지만 400년 마다 윤년이 된다.
		// 힌트 : 4의 배수  : year % 4 == 0
		//      100의 배수 : year % 100 == 0
		//      100의 배수가 아니다 : year % 100 != 0
		//      400의 배수 : year % 400 == 0
		boolean result;
		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		System.out.println(result);
		if(result) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		// 논리연산을 하려면 비교연산과 같이 해야 한다.
		System.out.println((4 + 5) * 3);
	}
}