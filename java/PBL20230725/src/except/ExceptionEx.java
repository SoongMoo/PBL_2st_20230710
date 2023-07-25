package except;

public class ExceptionEx {
	public static void main(String[] args) {
		try{
			System.out.println(10 / 0);
		}catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
