package operator;

public class OperationEx3 {
	public static void main(String[] args) {
		int i = 10;
		// 1씩 감소
		i = i - 1; //
		System.out.println(i); // 9
		--i;
		System.out.println(i);  // 8
		i = i - 1;
		System.out.println(i);  // 7
		--i; // 선행연산
		System.out.println(i);  // 6
		i--; // 후행연산
		System.out.println(i);
	}
}