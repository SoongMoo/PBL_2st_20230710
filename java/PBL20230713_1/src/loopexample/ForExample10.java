package loopexample;

import java.util.Scanner;

public class ForExample10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단을 입력하세요 : ");
		int startDan = sc.nextInt();
		System.out.print("마지막 단을 입력하세요 : ");
		int endDan = sc.nextInt();
		System.out.print("시작 곱을 입력하세요 : ");
		int startGop = sc.nextInt();
		System.out.print("마지막 곱을 입력하세요 : ");
		int endGop = sc.nextInt();
		for (int dan = startDan ; dan <= endDan ; dan++) {
			for(int gop = startGop; gop <= endGop; gop++) {
				System.out.println(dan + " * " + gop +" = " + (dan * gop));
			}
		}
	}
}


//AZBYCXDWEVFUGTHSIRJQKPLOMNNMOLPKQJRISHTGUFVEWDXCYBZA
/*
   1  2  3  4  5  6 7 8 9
**********************************
1* 1  2  3  4  5  6 7 8 9
2* 2  4  6  8  10 12 14 16 18
3* 3  6  9 12  15 18 21 24 27
4* 4  8 12 16  20 24 28 32 36 
...
9* 9 18 27 36 45 54 63 72 81
*/




