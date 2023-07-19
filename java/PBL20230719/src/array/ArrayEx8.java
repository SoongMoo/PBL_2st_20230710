package array;

public class ArrayEx8 {

	public static void main(String[] args) {
		int i [] = new int[4]; // 0,1,2,3
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[0]);
		//i[5] = 60;
		for(int idx = 0; idx < 6 ; idx ++) {
			System.out.println(i[idx]);
		}
	}
}
