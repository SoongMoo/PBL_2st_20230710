package ifexample;

public class IfExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if ~ else
		int money = 3000;
		// 돈이 3000원 이상이면 "차를타고가시오"를 출력하고
		// 3000원 미만이면 "걸어가시오"를 출력하시오
		if (money >= 3000) {
			System.out.println("차를 타고 가시오");
		}else {
			System.out.println("걸어가시오.");
		}
		char gender = 'F';
		if (gender == 'M') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		// 8세 이상이면 "학교를 다닙니다"를 출력
		// 이하이면 "학교를 다니지 않습니다"를 출력
		int age = 7;
		if (age >= 8) {
			System.out.println("학교를 다닙니다.");
		}else {
			System.out.println("학교를 다니지 않습니다");
		}
	}

}
