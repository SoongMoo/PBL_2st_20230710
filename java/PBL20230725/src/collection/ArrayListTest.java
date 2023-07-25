package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		int [] i = new int [2];
		i[0] = 10;
		i[1] = 20;
		System.out.println(i[0]);
		System.out.println(i[1]);
		// i[2] = 30; 크기가 고정이다.
		List list = new ArrayList();
		list.add(10);  // 0
		list.add(20);  // 1
		list.add("30");  // 2
		list.add(40);  // 3
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		// Collection <= List <=  ArrayList
		list.remove(0);
		//list.remove(20); // index와 Object중 index가 우선순위가 높다.
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	}
}





