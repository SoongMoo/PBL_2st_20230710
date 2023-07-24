package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		String [] str = new String[3];
		str[0] = "이숭무";
		str[1] = "이상범";
		str[2] = "이장범";
		// str[3] = "김찬중";
		for(String s: str) {
			System.out.println(s);
		}
		for(int idx = 0; idx < str.length; idx++) {
			System.out.println(str[idx]);
		}
		
		List<String> list = new ArrayList<String>();
		list.add("이숭무");
		list.add("이상범");
		list.add("이정범");
		list.add("김찬중"); // 추가
		for(String s: list) {
			System.out.println(s);
		}
		for(int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx)); // 받아옴
		}		
		
		//str[0]=null;
		//str[1]="";
		list.remove(0); // 삭제
		for(String s: list) {
			System.out.println(s);
		}
		list.remove("이상범");
		for(String s: list) {
			System.out.println(s);
		}
		System.out.println("삭제");
		list.clear(); // 모두 삭제
		for(String s: list) {
			System.out.println(s);
		}
		if(list.isEmpty()) { // 비어 있는지 확인
			System.out.println("데이터가 없습니다.");
		}
	}
}