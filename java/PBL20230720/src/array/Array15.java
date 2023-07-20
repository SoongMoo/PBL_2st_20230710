package array;

public class Array15 {

	public static void main(String[] args) {
		/// 깊은 복사
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
		
		// 참조 타입인 경우 : 얕은 복사 : 체크할 것
		Student stu[] = new Student[3];
		stu[0] = new Student(1000, "이숭무", 1);

		Student stu1 [] = stu.clone();
		System.out.println(stu[0].studentName);
		System.out.println(stu1[0].studentName);
		stu1[0].studentName = "이장범";
		System.out.println(stu[0].studentName);
		System.out.println(stu1[0].studentName);
	}
}
