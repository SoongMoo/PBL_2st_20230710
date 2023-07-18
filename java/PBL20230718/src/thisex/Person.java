package thisex;

public class Person {
	String name;
	int age;
	public Person() {
		this("이상범", 55);
	}
	public Person(String name) {
		this(name, 40);
	}
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}
}
