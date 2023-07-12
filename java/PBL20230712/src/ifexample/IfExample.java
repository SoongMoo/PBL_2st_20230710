package ifexample;

public class IfExample {
	public static void main(String[] args) {
		int i = 10;
		// 단일 if문 
		if (i < 5) 
			System.out.println("작다");     // 1: if문때문에 실행 안됨
		System.out.println("if문 실행"); //2:if문과 상관 없이 무조건실행
		// 위와 같은 결과를 갖는다.
		if (i < 5) {  
				System.out.println("작다");     // 1: if문때문에 실행 안됨
		}
		System.out.println("if문 실행"); // 2:if문과 상관 없이 무조건실행
		
		
		//////////////////////////////////////////////
		if (i < 5) {
			System.out.println("작다");     // 1
			System.out.println("if문 실행"); // 2
		}
		System.out.println("프로그램 종료");
	}
}
