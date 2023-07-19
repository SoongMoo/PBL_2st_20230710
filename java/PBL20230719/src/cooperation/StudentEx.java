package cooperation;

public class StudentEx {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setStudentName("이숭무");
		stu1.setGrade(2);
		stu1.setTakeBus(new Bus()); // 1000 , num,money 
		stu1.getTakeBus().setBusNum(100);
		Student stu2 = new Student();
		stu2.setStudentName("이상범");
		int i = 2;
		stu2.setGrade(i);
		// 2000
		Bus bus = new Bus(); //2000 num, money
		bus.setBusNum(200);		
		stu2.setTakeBus(bus);
		
		int kk = 3;
		stu2.setGrade(kk);
		
		System.out.println(bus.getMoney());
		System.out.println(stu1.getTakeBus().getBusNum());
		System.out.println(stu2.getTakeBus().getBusNum());
		
		System.out.println(stu2.getGrade());
		System.out.println(kk);
	}
}