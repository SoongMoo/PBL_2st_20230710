package cooperation;

public class Student {
	String studentName;
	int grade;
	
	Bus takeBus;
	Subway takeSubway;
	
	public Bus getTakeBus() {
		return takeBus;
	}
	public void setTakeBus(Bus takeBus) {
		this.takeBus = takeBus;
		this.takeBus.setMoney(1000);
	}
	public Subway getTakeSubway() {
		return takeSubway;
	}
	public void setTakeSubway(Subway takeSubway) {
		this.takeSubway = takeSubway;
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
		this.grade = 4;
	}
}
