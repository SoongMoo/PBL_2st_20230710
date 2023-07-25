package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest02 {
	public static void main(String [] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		//    key      value
		map.put(101, "이숭무");
		map.put(102, "이상범");
		map.put(103, "김찬중");
		
		String name = map.get(101);
		System.out.println(name);
		
		Map<Integer , Member> map1 = new HashMap<Integer, Member>();
			
		// value
		Member mem = new Member(101, "이숭무", "서울");
		Member mem1 = new Member(102, "이상범", "성남");
		Member mem2 = new Member(103, "김찬중", "의정부");
		
		map1.put(mem.getMemberId(), mem); // 101, member
		map1.put(mem1.getMemberId(), mem1); // 102 , member
		map1.put(mem2.getMemberId(), mem2); // 103, member
		
		Member m = map1.get(101);
		System.out.println(m.getAddr());
		System.out.println(m.getMemberId());
		System.out.println(m.getMemberName());
		
		m = map1.get(102);
		System.out.println(m.getAddr());
		System.out.println(m.getMemberId());
		System.out.println(m.getMemberName());
		
		m = map1.get(103);
		System.out.println(m.getAddr());
		System.out.println(m.getMemberId());
		System.out.println(m.getMemberName());
		
		for (Integer key : map1.keySet()) {
			Member m1 = map1.get(key);
			System.out.println(m1.getAddr());
			System.out.println(m1.getMemberId());
			System.out.println(m1.getMemberName());
		}
	}
}
