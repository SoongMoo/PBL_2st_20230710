package classpart;

public class FunctionEx {

	public static void main(String[] args) {
		int z = add(3);
		System.out.println(z);
		z = add(100);
		System.out.println(z);
		int x = 3;
		System.out.println(Math.pow(3, 2));	
	}
	/// add(x) = 2x + 3; // 함수 정의
	/// z = add(3)
	//  z?
	//    반환형 메서드명    매개변수:parameter
	static int   add   (    int x   )  {
		return 2 * x + 3; // 반환형 : return문 뒤에 있는 값의 자료형
		       //매개변수 
	}

}
