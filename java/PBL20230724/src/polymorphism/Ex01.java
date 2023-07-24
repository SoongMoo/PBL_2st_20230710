package polymorphism;

public class Ex01 {

	public static void main(String[] args) {
		B b = new B(); //' A상속
		C c = new C(); //  A상속
		D d = new D(); // A 상속
		A a = b;
		a.add(10, 20);
		a = c;
		a.add(10, 20);
		a = d;
		a.add(10, 20);
	}

}
