package constructor;

public class PersonEx {

	public static void main(String[] args) {
		Person ps1 = new Person();
		// 초기화 메서드
		ps1.setData("이숭무",25 , 80.5F, 172.5F);
		System.out.println(ps1.getAge());
		// 생성자
		Person ps2 = new Person("김찬중",30,180.0F,180.5F);
		System.out.println(ps2.getHeight());
		
		Person ps3 = new Person();
		/// setter
		ps3.setAge(25);
		ps3.setHeight(180.5F);
		ps3.setName("이상범");
		ps3.setWeight(80.5F);
		System.out.println(ps3.getName());
		
	}

}
