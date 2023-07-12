package operator;

public class OperationEx4 {
	public static void main(String[] args) {
		int i = 10;
		int result;
		i = i + 1;
		result = i;
		System.out.println(i);
		System.out.println(result);
		result = ++i; // 선행
		System.out.println(i);
		System.out.println(result);
		i = 10;
		result = i; // 10
		i = i + 1; // 11
		System.out.println(i);
		System.out.println(result);
		result = i++; // 후행
		System.out.println(i);
		System.out.println(result);
	}
}
