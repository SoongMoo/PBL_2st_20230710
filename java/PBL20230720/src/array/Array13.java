package array;

public class Array13 {

	public static void main(String[] args) {
		int i [] = new int[3];
		for(int idx = 0; idx < i.length ; idx++) {
			System.out.println(i[idx]);
		}
		double d [] = new double[3];
		for(int idx = 0; idx <d.length ; idx++) {
			System.out.println(d[idx]);
		}
		String str [] = new String[3];
		String str1 = "이숭무";
		String str2;
		str[0] = "이숭무";
		Student stu1;
		Student stu[] = new Student[3];//[주소][null][null]
		stu[0] = new Student(100, "dltnfan", 12);
	}
}