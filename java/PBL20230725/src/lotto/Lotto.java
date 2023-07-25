package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		List<Integer> lottoNum  = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 수량을 입력하세요.");
		int cnt = sc.nextInt();
		for(int ii = 1; ii <= cnt; ii++) {
			for (int i = 1; i <= 45 ; i++) {
				lottoNum.add(i);
			}
			//System.out.println(lottoNum);
			int lottoSize = lottoNum.size();
			for(int i = 1; i <= 6; i++) {
				int idx =(int)(Math.random() * lottoSize); 
				int lotto = lottoNum.remove(idx);
				System.out.print(lotto + "," );
				lottoSize--;
			}
			lottoNum.clear();
			System.out.println();
		}
	}
}
