package loopexample;

public class ForExample7 {
	public static void main(String[] args) {
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[2]);
		/*
		if(args[0].equals("/?")) {
			System.out.println("help");
			System.out.println("도움말이 출력...");
		}else {
			System.out.println(args[0]);
		}
		*/
		int sum = 0;
		for(int num = Integer.parseInt(args[0]); 
				num <= Integer.parseInt(args[1]) ; num++) {
			sum += num;//sum = sum + num;
		}
		System.out.println("sum = " + sum);
	}
}






