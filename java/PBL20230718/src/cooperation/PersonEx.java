package cooperation;

public class PersonEx {

	public static void main(String[] args) {
		Person ps1 = new Person();
		ps1.setName("이숭무");
		int i = 30;
		ps1.setAge(i);
		Bus bus = new Bus();
		ps1.setTakeBus(bus); // 객체 전달 
		ps1.getTakeBus().setMoney(100);
		
		
		Person ps2 = new Person();
		ps2.setName("이상범"); // ps2.name="이상범";
		ps2.setAge(35);
		//Subway subway = new Subway();
		// ps2.setTakeSubway(subway);
		ps2.setTakeSubway(new Subway());
		ps2.getTakeSubway().setLineNumber("1호선");
		System.out.println(ps2.getName());
		System.out.println(ps2.getTakeSubway().getLineNumber());
		
		Person ps3 = new Person();
		ps3.setName("김찬중");
		Bus b1 = new Bus();
		b1.setNumber(120);
		ps3.setTakeBus(b1);
		System.out.println(ps3.getTakeBus().getNumber());
		

	
	}

}
