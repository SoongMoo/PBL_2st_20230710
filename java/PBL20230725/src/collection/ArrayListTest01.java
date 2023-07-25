package collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListTest01 {
	public static void main(String[] args) {
		int i [] = new int [2];
		System.out.println(i[0]);
		System.out.println(i[1]);
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		//list.add("20"); X
		List<Member> list1 = new ArrayList<Member>();
	}
}