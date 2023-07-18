package cooperation;

public class Person {
	String name;
	int age;
	
	Bus takeBus;
	Subway takeSubway;
	
	public Bus getTakeBus() {
		return takeBus;
	}
	public void setTakeBus(Bus takeBus) {
		this.takeBus = takeBus;
	}
	public Subway getTakeSubway() {
		return takeSubway;
	}
	public void setTakeSubway(Subway takeSubway) {
		this.takeSubway = takeSubway;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
