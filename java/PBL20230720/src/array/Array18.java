package array;

public class Array18 {

	public static void main(String[] args) {
		int [] i0 = new int[2];
		int [] i1 = new int[2];
		int [] i2 = new int[2];
		i0[0] = 10;
		i0[1] = 20;
		i1[0] = 10;
		i1[1] = 20;
		i2[0] = 10;
		i2[1] = 20;
		
		for(int idx = 0, val=10 ; idx < i0.length; idx++, val+=10) {
			i0[idx] = val;
		}
		for(int idx = 0, val=10 ; idx < i1.length; idx++, val+=10) {
			i1[idx] = val;
		}
		for(int idx = 0, val=10 ; idx < i2.length; idx++, val+=10) {
			i2[idx] = val;
		}
		
		int [][] ii = new int[3][2];
		for(int row = 0;row < ii.length; row++ ) {
			int val= 10;
			for(int idx = 0 ; idx < ii[row].length; idx++) {
				ii[row][idx] = val+=10;
			}
		}
		//                     행의크기
		for(int row = 0; row < ii.length ; row++) {
			//                       열의 크기
			for(int col = 0; col < ii[row].length ; col++) {
				System.out.println("ii["+row+"]["+col+"]="+ii[row][col]);
			}
		}
	}
}
