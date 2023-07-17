package classpart;

public class Student01 {
	private int id; // 학번
	private String name;
	private int grade;
	private String addr;
	
	public void setId(int id1) {
		this.id = id1;
	}
					  // parameter : 매개변수
	public void setAddr(String addr) { // 피호출함수
		this.addr = addr;
	}
	
	public int getId() {
		return id;
	}
	public String getAddr() {
		return addr;
	}
	
	
}
