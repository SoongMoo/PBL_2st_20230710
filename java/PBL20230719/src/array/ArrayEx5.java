package array;

public class ArrayEx5 {
	public static void main(String [] args) {
		int i [] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		for(int idx = 0; idx < i.length ; idx++) {
			System.out.println(i[idx]);
		}
	}
}
