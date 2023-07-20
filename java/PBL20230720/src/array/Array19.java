package array;

public class Array19 {
	public static void main(String[] args) {
		int i [] = {1,2,3,4};
		int j [] = {5,6,7,8};
		int ii [][] = {{1,2,3,4},{5,6,7,8}};
		for(int k[] : ii) {
			for(int l:  k) {
				System.out.println(l);
			}
		}
	}
}