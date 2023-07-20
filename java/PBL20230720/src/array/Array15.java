package array;

public class Array15 {

	public static void main(String[] args) {
		/// 깊은 복사
		
		Student st = new Student(10000, "이장범", 1);
		Student st1 = new Student();
		st1.grade = st.grade;
		st1.studentId = st.studentId;
		st1.studentName = st.studentName;
		st1.setGrade(st.getGrade());
		st1.setStudentId(st.getStudentId());
		st1.setStudentName(st.getStudentName());
		
		
		int i [] = {1,2,3,4}; // [0][1][2][3]
		//                        1  2  3  4
		int [] j = i.clone();
		System.out.println(i[0]);
		System.out.println(j[0]);
		System.out.println(i[3]);
		System.out.println(j[3]);
		j[1] = 100;
		System.out.println(i[1]);
		System.out.println(j[1]);
		
		// 얕은 복사
		Student stu[] = new Student[3];
		stu[0] = new Student(1000, "이숭무", 1);
		stu[1] = new Student(1001, "이상범", 2);
		stu[2] = new Student(1003, "이장범", 3);
		Student stu1 [] = stu.clone();
		System.out.println(stu[0].studentName);
		System.out.println(stu1[0].studentName);
		stu1[0].studentName = "이장범";
		System.out.println(stu[0].studentName);
		System.out.println(stu1[0].studentName);
		
		// 객체인 경우 깉은 복사
		Student stu2 [] = new Student[3];
		for(int idx = 0; idx < stu2.length ; idx++) {
			stu2[idx] = new Student();
		}
		for(int idx= 0; idx < stu2.length ; idx++) {
			stu2[idx].setGrade(stu[idx].getGrade());
			stu2[idx].setStudentId(stu[idx].getStudentId());
			stu2[idx].setStudentName(stu[idx].getStudentName());
		}
	}
}
