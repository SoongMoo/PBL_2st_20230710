package operator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OperationEx8 {
	public static void main(String[] args) {
		// 대입연산자 =
		int i ;
		i = 10; 
		System.out.println(i);
		i = i + 1;
		System.out.println(i);
		++i;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);
		i += 1; // 대입연산자
		System.out.println(i);
		i = i + 10;
		System.out.println(i);
		i += 10;
		System.out.println(i);
		int j = 20;
		i = i + j;
		System.out.println(i);
		i += j;
		System.out.println(i);
		i = 15 + i;
		System.out.println(i);
		i += 15;
		System.out.println(i);
		i = i - 5;
		System.out.println(i);
		i -= 5;
		System.out.println(i);
		i = i * 5;
		System.out.println(i);
		i *= 5;
		System.out.println(i);
		i = i % 3;
		System.out.println(i);
		i %= 3;
		System.out.println(i);
		// +, -, *, /, %
		
	}
}