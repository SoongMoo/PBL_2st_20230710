package reference;

public class StudentEx {

	public static void main(String[] args) {
		Student2 st1 = new Student2();
		st1.studentId = 1234;
		st1.studentName = "이숭무";
		st1.korea = new Subject();
		st1.korea.subjectName="이숭무 왜???";
		st1.korea.scorePoint = 100;
		st1.math = new Subject();
		st1.math.subjectName="방정식";
		st1.math.scorePoint=80;
		
		System.out.println(st1.math.subjectName);
		
		Student2 st2 = new Student2();
		st2.setStudentId(1236);
		st2.setStudentName("이숭무");
		st2.setKorea(new Subject());
		st2.getKorea().setSubjectName("이숭무는 왜???");
		st2.getKorea().setScorePoint(1000);
		st2.setMath(new Subject());
		st2.getMath().setScorePoint(80);
		st2.getMath().setSubjectName("방정식");
		System.out.println(st2.getMath().getScorePoint());
	}

}
