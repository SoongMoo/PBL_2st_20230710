package polymorphism;

public class D extends A{
	@Override
	public void add(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println(num1 + num2 +4);
	}
	public void div(int num1 , int num2) {
		System.out.println(num1 / num2);
	}
}
