package classpart;
// 클래스를 만들어주는 이유는 클래스 내에 있는 변수를 사용하겠다.
// 구성요소 : 변수, 함수
public class ClassPart {
	// 멤버 변수, 인스턴스 변수, 
	int start;
	int end;
	int result;
	// 멤버 메서드
	public void add() {
		result = start + end;
		System.out.println(result);
	}
	public void sub() {
		result = start + end;
		System.out.println(result);
	}
}
