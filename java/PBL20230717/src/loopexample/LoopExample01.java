package loopexample;

public class LoopExample01 {

	public static void main(String[] args) {
		/// 7단
		int j = 11;
		for(int i = 1 /*반복변수 */ ; i <= 9 ; i++) {
			System.out.println(" 7 * " + j + " = " + (7 * j));
			//System.out.println(j);
			j++;
		}
	}

}
