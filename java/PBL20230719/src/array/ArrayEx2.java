package array;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		int i [] = new int[4]; //0,1,2,3
		int size = i.length;
		System.out.println(size);
		/*
		int j;
		System.out.println(j);
		*/
		System.out.println(i[0]);
		for(int idx = 0 ; idx < i.length ; idx++) {
			System.out.println(i[idx]);
		}
		double d [] = new double[4];
		for(int idx = 0 ; idx < d.length ; idx++) {
			System.out.println(d[idx]);
		}
		String [] str = new String [4];
		for(int idx = 0; idx < str.length ; idx++) {
			System.out.println(str[idx]);
		}
		boolean b [] = new boolean [4];
		for(int idx = 0; idx < b.length ; idx++) {
			System.out.println(b[idx]);
		}
	}
}
