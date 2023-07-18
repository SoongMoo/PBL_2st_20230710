package constructor;

public class Person {
	// class 의 구성요소 : 변수, 메서드, 생성자
	// 멤버변수, 멤버필드, ,인스턴스 변수
	String name;
	int age;
	float weight;
	float height;
	/// 멤버 필드를 초기화하기 위해서 이다.
	public void setData(String name, int age, 
						float weight, float height) {
		this.age = age;
		this.height = height;
		this.name = name;
		this.weight = weight;
	}
	public Person() {}
	/// 생성자 : 멤버필드를 초기화 하기 위한 것이다.
	public Person(String name, int age, 
			float weight, float height) {
		this.age = age;
		this.height = height;
		this.name = name;
		this.weight = weight;
	}
	// setter
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(float weight) {
		this.weight= weight;
	}
	///getter
	public int getAge() {
		return this.age;
	}
	public float getHeight() {
		return this.height;
	}
	public float getWeight() {
		return this.weight;
	}
	public String getName() {
		return this.name;
	}
	
}




