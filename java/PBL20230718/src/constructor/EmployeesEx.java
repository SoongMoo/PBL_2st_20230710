package constructor;

public class EmployeesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees emp1 = new Employees();
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		//문자열이지만 값을 초기화하지 않아서 null이 가지고 있다.
		System.out.println(emp1.getTel()); 
		
		Employees emp2 = new Employees("김찬중", 25);
		System.out.println(emp2.getTel());
		emp2.setTel("031");
		emp2.setAddr("의정부");
		System.out.println(emp2.getAddr());
		System.out.println(emp2.getAge());
		System.out.println(emp2.getName());
		System.out.println(emp2.getTel());
		
		Employees emp3 = new Employees("이상범", "성남");
		emp3.setAge(30);
		emp3.setTel("031");
		emp3.setPasswd("1234");
		emp3.setPasswdCon("12345");
		System.out.println(emp3.getAddr());
		System.out.println(emp3.getAge());
		System.out.println(emp3.getName());
		System.out.println(emp3.getTel());	
		System.out.println(emp3.isPasswdEqualsPasswdCon());
		emp3.print();
	}
}
