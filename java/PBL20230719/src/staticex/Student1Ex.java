package staticex;

public class Student1Ex {

	public static void main(String[] args) {
		Student1 stu1 = new Student1();
		stu1.studentId = Student1.num++;
		System.out.println(stu1.studentId);
		System.out.println(Student1.num);
		
		Student1 stu2 = new Student1();
		stu2.studentId = Student1.num++;
		System.out.println(stu2.studentId);
		System.out.println(Student1.num);
	}

}
