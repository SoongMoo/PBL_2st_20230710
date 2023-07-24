package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		List list = new ArrayList(); //API
		list.add("이숭무");
		System.out.println(list.get(0));
		list.add(10);
		System.out.println(list.get(1));
		for(int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}
		for(Object v : list) {
				System.out.println(v);
		}
		
		

	}

}
