package array;

public class Array20 {

	public static void main(String[] args) {
		int ii [][] = 
			{{1,2,3,4},{5,6,7},{8,9,10,11,12}};
		for(int row = 0; row < ii.length; row++) {
			for(int col = 0; col < ii[row].length ; col++) {
				System.out.println(ii[row][col]);
			}
		}
		for(int i[] : ii) {
			for (int v : i) {
				System.out.println(v);
			}
		}
		int iii [][] = new  int[3][];
		iii[0] = new int[]{1,2,3,4};
		iii[1] = new int[] {5,6,7};
		iii[2] = new int[] {8,9,10,11,12};
		
		
		int iiii [][] = new  int[3][];
		int [] i1 = new int[4];
		int [] i2 = new int[3];
		int [] i3 = new int[5];
		iiii[0] = i1;
		
	}
}
