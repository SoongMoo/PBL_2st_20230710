package array;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Array14 {

	public static void main(String[] args) {
		Student stu1 = new Student(1000, "이숭무", 1);
		// 얕은 복사
		Student stu2 = stu1; 
		stu2.grade = 2; // 1000, 이숭무, 2
		System.out.println(stu1.studentId); // 1000
		System.out.println(stu1.studentName); // 이숭무
		System.out.println(stu1.grade); //

		Student stu [] = new Student[3];
		stu[0] = new Student(1001, "이장범", 1);
		System.out.println("1111 : " +stu[0].grade);

		Student [] stu3;
		// 얕은 복사
		stu3 = stu; 
		stu3[0].grade = 3;
		System.out.println("1111 : " + stu[0].grade);
		System.out.println("2222 : " + stu3[0].grade);
		
		Student [] stu4 = new Student[3];
		// 얕은 복사
		System.arraycopy(stu, 0, stu4, 0, 3); 
		stu4[0].grade = 3;
		System.out.println("3333 : " + stu[0].grade);
		System.out.println("4444 : " + stu4[0].grade);
	}
}