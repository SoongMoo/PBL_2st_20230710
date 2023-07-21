package polymorphism;

public class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다. ");
	}
}
