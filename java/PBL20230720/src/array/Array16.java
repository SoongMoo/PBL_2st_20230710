package array;

public class Array16 {
	public static void main(String[] args) {
		int i [] = {1,2,3,4,5};
		for(int idx = 0; idx < i.length ; idx++) {
			System.out.println(i[idx]);
		}
		// for each // 배열인 경우 사용
		for(int val : i) {
			System.out.println(val);
		}
		Student [] stu = new Student[10];
		stu[0] = new Student(1000, "이숭무", 1);
		stu[1] = new Student(1001, "이장범", 2);
		for(int idx= 0; idx < stu.length; idx++ ) {
			if(stu[idx] == null) break;
			System.out.println(stu[idx].studentName);
		}
		for(Student s : stu) {
			if(s == null) break;
			System.out.println(s.studentName);
		}
		
		
		
	}
}
