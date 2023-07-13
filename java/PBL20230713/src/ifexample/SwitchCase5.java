package ifexample;

public class SwitchCase5 {
	public static void main(String[] args) {
		/// 3~5월 : 봄입니다.
		/// 6~8월 : 여름입니다.
		/// 9~11월 : 가을입니다.
		/// 12~2월 : 겨울입니다.
		int month = 4;
		switch(month) {
		case 12: case 1: 
		case 2: System.out.println("겨울입니다.");break;
		case 3:case 4:
		case 5: System.out.println("봄입니다");break;
		case 6: case 7:
		case 8: System.out.println("여름입니다.");break;
		default : System.out.println("가을입니다.");
		}
		/// 1월 3월 5월 7월 8월 10월 12월은 31일
		/// 2월 28일
		/// 나머지 달(4,6,9,11월)은 30일
		int day = 1;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: 
		case 12: 
			day = 31;	
			break;
		case 2: 
			day = 28; 
			break;
		default : 
			day = 30;
		}
		System.out.println(month +"월은 " + day +"일까지입니다");
	}
}
//// 제어문 : 조건문  (if, switch) 
///         반복문 (for, while, do ~ while) 






