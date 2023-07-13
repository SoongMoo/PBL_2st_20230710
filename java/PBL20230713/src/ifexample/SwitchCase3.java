package ifexample;

public class SwitchCase3 {

	public static void main(String[] args) {
		int score = 93;
		if(score >= 95) { // 100,99,98,97,96,95
			System.out.println("A+");
		}else if(score >= 90) { //94,93,92,91,90
			System.out.println("A");
		}
		///////////
		switch(score) {
		case 100 :case 99 :	case 98 :case 97 :case 96 :
		case 95 :
			System.out.println("A+");
			break;
		case 94 :case 93 :	case 92 :case 91 :
		case 90 :
			System.out.println("A");
			break;
		}
	}

}
