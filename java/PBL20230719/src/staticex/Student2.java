package staticex;

public class Student2 {
	static int i = 10;
	static int j;
	static int result;
	static { // static변수를 초기화
		j = 20;
	}
	public static void add() {
		result = i + j;
	}
}
