package classpart;

public class FunctionEx01 {
	public static void main(String[] args) {
		//3단
		guguDan(3);
		//5단
		guguDan(5);
		//9단
		guguDan(9);
		for (int i = 2; i <= 7 ; i++ ) {
			guguDan(i);
		}
	}
	/// 반복적으로 사용해야 하는 코드가 있는 경우
	public static void guguDan(int dan) {
		for(int i = 1 ; i <= 9; i++) {
			System.out.println(dan +" * " + i + " = " + (dan * i));
		}
	}

}
