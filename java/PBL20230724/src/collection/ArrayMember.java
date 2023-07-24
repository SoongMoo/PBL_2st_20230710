package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayMember {

	public static void main(String[] args) {

		List<Member>list = new ArrayList<Member>();
		Member mem = new Member("hk00001", "high", "1234","이숭무", 20, 170.5);
		list.add(mem);
		Member mem1 = new Member("hk00002", "highl", "1234","이상범", 20, 170.5);
		list.add(mem1);
		Member mem2 = new Member("hk00003", "highla", "1234","이장범", 20, 170.5);
		list.add(mem2);
		Member mem3 = new Member("hk00004", "highland", "1234","김잔중", 20, 170.5);
		list.add(mem3);
		System.out.println(list.size());
		List<Member>list1 = new ArrayList<Member>();
		System.out.println(list1.size());
		
		for(Member m : list) {
			System.out.println(m.getMemberId());
			System.out.println(m.getMemberName());
		}
		for(int idx = 0; idx < list.size(); idx++) {
			Member m  = list.get(idx);
			System.out.println(m.getMemberId());
			System.out.println(m.getMemberName());
		}
		/// 이숭무Member를 삭제 하시오
		for(Member m : list) {
			if(m.getMemberName().equals("이숭무")) {
				list.remove(m);
				break;
			}
		}
		for(Member m : list) {
			System.out.println(m.getMemberId());
			System.out.println(m.getMemberName());
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		
		
	}
}
