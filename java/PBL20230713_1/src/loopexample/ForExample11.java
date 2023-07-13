package loopexample;

public class ForExample11 {

	public static void main(String[] args) {
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((int)'Z' - (int)'A');
		//AZBYCXDWEVFUGTHSIRJQKPLOMNNMOLPKQJRISHTGUFVEWDXCYBZA
		int j = 25;
		for (int i = 65; i <= 90; i++) {
		  System.out.print((char)i);
		  System.out.print((char)(j + 65));
		  j--;
		}
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
		System.out.println();
		System.out.println("       ");
		for (int i = 1; i <= 9; i++) {
		    System.out.print(i + "   ");
		}
		System.out.println();
		System.out.println("\t**********************************");
		for (int i = 1; i <= 9; i++) {
		    System.out.print(i + "*          ");
		    for (int k = 1; k <= 9; k++) {
		        System.out.print((i * k) + "   ");
		    }
		    System.out.println();
		}
		/*
		2*1=2 3*1=3 ?????? 9*1=9
		2*2=4 3*2=6 ?????? 9*2=18
		2*3=6 3*3=9 ?????? 9*9=81
		???
		2*9=18 3*9=27?????? 9*9=81
		*/
		
		/*
			*
		   ***
		  *****
		   ***
		    *
		*/
		int n = 3;  // 패턴의 크기
		for (int i = 1; i <= 2 * n - 1; i++) {
		    int rowCount = i <= n ? i : 2 * n - i;
		    int spaceCount = n - rowCount;
		    int starCount = 2 * rowCount - 1;
		    for (int k = 1; k <= spaceCount; k++) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= starCount; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		//////////////////////////////////////////
		/*
		int n = 3;  // 패턴의 크기
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= 2 * i - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
		    for (int j = 1; j <= n - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= 2 * i - 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		*/
	}
}
