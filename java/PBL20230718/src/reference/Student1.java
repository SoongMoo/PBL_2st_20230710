package reference;

public class Student1 {
	int studentId;
	String studentName;
	String koreaSubject;
	int koreaScore;
	String mathSubject;
	int mathScore;
	/// setter
	public void setKoreaSubject(String koreaSubject) {
		this.koreaSubject = koreaSubject;
	}
	public void setMathSubject(String mathSubject) {
		this.mathSubject = mathSubject;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setKoreaScore(int koreaScore) {
		this.koreaScore = koreaScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	/// getter
	public String getKoreaSubject() {
		return koreaSubject;
	}
	public String getMathSubject() {
		return mathSubject;
	}
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getKoreaScore() {
		return koreaScore;
	}
	public int getMathScore() {
		return mathScore;
	}
}
