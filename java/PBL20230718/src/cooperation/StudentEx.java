package cooperation;

public class StudentEx {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStudentId(1223);
		st1.setStudentName("이숭무");
		st1.setKorea(new Subject());
		st1.getKorea().setSubjectName("이숭무는 왜???");
		st1.getKorea().setScorePoint(80);
		st1.setMath(new Subject());
		st1.getMath().setSubjectName("방정식");
		st1.getMath().setScorePoint(75);
		st1.print();
		
		Subject korea = new Subject();
		korea.setSubjectName("이숭무는 왜???");
		korea.setScorePoint(80);
		
		Student st2 = new Student();
		st2.setStudentId(4567);
		st2.setStudentName("이상범");
		st2.setMath(new Subject());
		st2.getMath().setSubjectName("방정식");
		st2.getMath().setScorePoint(77);
		st2.setKorea(korea);
		st2.print();
		
		

	}

}
