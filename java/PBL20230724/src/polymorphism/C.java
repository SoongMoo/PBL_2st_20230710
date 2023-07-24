package polymorphism;

public class C extends A{
	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + num2 + 3);
	}
	public void mul(int num1 , int num2) {
		System.out.println(num1 * num2);
	}
}
