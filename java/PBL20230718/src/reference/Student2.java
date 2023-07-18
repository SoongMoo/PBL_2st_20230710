package reference;

public class Student2 {
	int studentId;
	String studentName;
 // 참조자료형	
	Subject korea; // 참조변수
	Subject math;
	
	public void setKorea(Subject korea) {
		this.korea = korea;
	}
	public void setMath(Subject math) {
		this.math = math;
	}
	public Subject getKorea() {
		return this.korea;
	}
	public Subject getMath() {
		return math;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
