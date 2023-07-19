package array;

public class ArrayEx {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i4 = 40;
		int i [] = new int[4];
		// [0][1][2][3] : index
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		int idx = 3;
		i[idx] = 100;
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		for(int j = 0; j <= 3; j++) {
			System.out.println(i[j]);
		}
		
	}
}
