package loopexample;

public class BreakExample01 {
	public static void main(String[] args) {
		/// 1 ~ 1000까지 합을 구할 때 100에서 중지가 되게 하시오
		int sum = 0;
		int i = 0;
		while(i <= 999) {
			i++;
			if(i == 100) break;
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
}
// 제어문 : 조건문  : if , switch
//         반복문 : for , while , do ~ while
//                 break, continue
