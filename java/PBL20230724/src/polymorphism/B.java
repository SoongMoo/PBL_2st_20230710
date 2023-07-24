package polymorphism;

public class B extends A{
	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + num2 + 2);
	}
	public void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}
}
