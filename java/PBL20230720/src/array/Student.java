package array;

public class Student {
	int studentId;
	String studentName;
	int grade;
	public Student() {}
	public Student(int studentId, String studentName, int grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
