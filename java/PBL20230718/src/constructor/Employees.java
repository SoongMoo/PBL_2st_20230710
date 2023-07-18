package constructor;

public class Employees {
	String name;
	int age;
	String addr;
	String tel;
	String passwd;
	String passwdCon;
	/// 생성자 오버로딩
	public Employees() {
		this.name = "이숭무";
	}
	public Employees(String name, int age, String addr,
					String tel) {
		this.addr =addr;
		this.age = age;
		this.name = name;
		this.tel = tel;
	}
	public Employees(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Employees(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	/* 생성자끼리는 매개변수의 개수가 다르거나 타입순서가 달라야 한다.
	public Employees(String name, String tel) {
		
	}
	*/	
	///setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setTel(String tel) {
		this.tel = tel;	
	}
	public void setAge(int age) {
		this.age = age;
	}
	///getter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getAddr() {
		return this.addr;
	}
	public String getTel() {
		return this.tel;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public void setPasswdCon(String passwdCon) {
		this.passwdCon = passwdCon;
	}
	/// 비밀번호 비교
	public boolean isPasswdEqualsPasswdCon() {
		return passwd.equals(passwdCon);
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(tel);
		System.out.println(addr);
	}
	
	
	
	
	
	
	
	
	
}
