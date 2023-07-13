package ifexample;

public class SwitchCase4 {
	public static void main(String [] args) {
		int score = 40;
		if(score >= 30 && score <= 50) {
			System.out.println(score);
		}
		
		score = 10;
		if(score < 30 || score > 50) {
			System.out.println(score);
		}
		if(!(score >= 30 && score <= 50)) {
			System.out.println(score);
		}
	}
}
