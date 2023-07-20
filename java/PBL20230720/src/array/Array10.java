package array;

public class Array10 {

	public static void main(String[] args) {
		int i [] = new int[5];
		int cnt = 0;
		i[0] = 10;cnt++;
		i[1] = 20;cnt++;
		i[2] = 30;cnt++;
		for (int idx = 0; idx < cnt ; idx++) {
			System.out.println(i[idx]);
		}
		for(int idx = 0; idx < i.length ; idx++) {
			if(i[idx] == 0) break;
			System.out.println(i[idx]);
		}
	}
}