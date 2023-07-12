package ifexample;

public class SwitchCase {
	public static void main(String[] args) {
		char gender = 'F';
		if (gender == 'M') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		///////////////////////////////////
		// if문 대신 사용하는데 비교연산이 등호(==)인 경우만 사용가능 
		switch(gender) {
		default : 
			System.out.println("여자");
			break;
		case 'M':
			System.out.println("남자");
			break;
		}
		switch(gender) {
		case 'M':
			System.out.println("남자");
			break;
		case 'F':
			System.out.println("여자");
		}
		System.out.println("break가 없을 때");
		switch(gender) {
		case 'F':
			System.out.println("여자");
		case 'M':
			System.out.println("남자");
		}
	}
}