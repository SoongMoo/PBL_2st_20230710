package ifexample;

public class SwitchCase1 {

	public static void main(String[] args) {
		// 지역번호에 해당하는 지역을 출력하시오
		String  num = "02"; 
		switch(num) {
		case "02":
			System.out.println("서울");
			break;
		case "031":
			System.out.println("경기도");
			break;
		case "032":
			System.out.println("인천");
			break;
		case "052":
			System.out.println("울산");
			 break;
		case "051":
			System.out.println("부산");
		}

	}

}
