package cooperation;

public class Student {
	int studentId;
	String studentName;
	Subject korea;
	Subject math;
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
	public Subject getKorea() {
		return korea;
	}
	// 객체를 매개변수로 사용할 수 있다.
	public void setKorea(Subject korea) {
		this.korea = korea;
	}
	public Subject getMath() {
		return math;
	}
	public void setMath(Subject math) {
		this.math = math;
	}
	
	public void print() {
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(korea.getSubjectName());
		System.out.println(korea.getScorePoint());
		System.out.println(math.getSubjectName());
		System.out.println(math.getScorePoint());
	}
}
