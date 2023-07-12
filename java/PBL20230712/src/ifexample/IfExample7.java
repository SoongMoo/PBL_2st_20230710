package ifexample;

public class IfExample7 {
	public static void main(String[] args) {
		String str  = "이숭무"; // 문자열
		char ch = '이'; // 문자
		
		int money = 3000;
		// 돈이 3000원 이상이면 "차를타고가시오"를 출력하고
		// 3000원 미만이면 "걸어가시오"를 출력하시오
		String result;
		if (money >= 3000) {
			result = "차를타고가시오";
		}else {
			result = "걸어가시오";
		}
		System.out.println(result);
		/// 삼항연산자  : 조건연산자
		result = money >= 3000 ? "차를타고가시오" : "걸어가시오";
		System.out.println(result);
	}
}
