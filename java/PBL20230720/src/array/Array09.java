package array;

public class Array09 {
	public static void main(String [] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int i [] = new int[3];// [0][1][2]
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		int j [] = new int[] {1,2,2,3,4,5,66,67,7};
		System.out.println(j[j.length - 1]);
		j[8] = 300;
		j[j.length - 1] = 300;
		j[j.length - 2] = 200;
	}
}