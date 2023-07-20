package array;

public class Array12 {
	public static void main(String [] args) {
		Student stu1 = new Student(10001,"이숭무", 1);
		Student stu2 = new Student(10002,"이상범", 1);
		Student stu3 = new Student(10003,"이장범", 1);
		
		Student [] stu = new Student[30];// [0][1][2][3]
		//
		stu[0] = new Student(10001,"이숭무", 1);
		stu[1] = new Student(10002,"이상범", 1);
		stu[2] = new Student(10003,"이장범", 1);
		for(int idx = 0; idx <stu.length ; idx++) {
			if(stu[idx] == null) break;
			System.out.println(stu[idx].studentName);
		}
	}
}
