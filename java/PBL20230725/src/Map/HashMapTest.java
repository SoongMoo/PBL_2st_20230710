package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		int i [] = new int[2];
		i[0] = 10;
		i[1] = 10;
		System.out.println(i[0]);
		Integer [] i1 = new Integer[2];
		i1[0] = 10;
		i1[1] = null;
		System.out.println(i1[0]);
		List<Integer> list = new ArrayList<Integer>();
		//    value
		list.add(10);     // 0   
		list.add(null);   // 1
 		list.add(20);     // 2
		System.out.println(list.get(0));
		list.remove(0); // 정수인 경우 object보다 index가 우선하므로 index를 사용
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		// 배열과 컬렉션의 공통점은 index를 사용해야한다.
		// Map은 index를 사용하지 않는다. 
		Map<Integer , String> map = new HashMap<Integer, String>();
		//   key       value
		map.put(1000112, "이숭무");
		map.put(1111001, "이상범");
		System.out.println(map.get(1000112));
		map.remove(1111001);
		System.out.println(map.size());
		map.remove(1000112, "이숭무");
		System.out.println(map.size());
		map.clear();
		System.out.println(map.isEmpty());
	}
}




