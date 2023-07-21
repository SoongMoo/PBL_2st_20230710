package polymorphism;

public class AnimalEx {

	public static void main(String[] args) {
		Animal ex;
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		ex = h;
		ex.move();
		ex = t;
		ex.move();
		ex = e;
		ex.move();
	}
}
