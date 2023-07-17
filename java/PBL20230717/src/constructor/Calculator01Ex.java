package constructor;

public class Calculator01Ex {

	public static void main(String[] args) {
		Calculator01 ex = new Calculator01(10, 3);
		int result = ex.add();
		System.out.println(result);
		result = ex.sub();
		System.out.println(result);
		
		Calculator01 ex1 = new Calculator01();
	}
}
