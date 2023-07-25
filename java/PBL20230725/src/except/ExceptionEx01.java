package except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx01 {
	
	public static void main(String[] args) {
		 String stop="";
		 Scanner sc = new Scanner(System.in);
		 do {
			 try {
				 System.out.println("숫자를 입력해주세요.");
				 double num1 = sc.nextDouble();
				 System.out.println("숫자를 입력해주세요.");
				 double num2 = sc.nextDouble();
				 System.out.println(num1 / num2);
				 sc.nextLine();
			 }catch(Exception e) {
				 System.out.println("숫만 입력해주세요.");
			 }
			 System.out.println("계속하려면 아무키, 종료하려면 'y'");
			 stop = sc.nextLine();
		 }while(!(stop.equals("Y")||stop.equals("y")));
	}
}
