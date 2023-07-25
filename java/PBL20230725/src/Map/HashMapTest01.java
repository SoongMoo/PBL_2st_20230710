package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest01 {

	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("성남");
		list.add("의정부");
		list.add("분당");
		for(String s: list) {
			System.out.println(s);
		}
		for(int idx = 0; idx < list.size(); idx++) {
			System.out.println(list.get(idx));
		}
		Map<String , String> map = new HashMap<String, String>();
		map.put("이숭무", "성남");
		map.put("이상무", "의정부");
		map.put("이길무", "분당");
		System.out.println(map.keySet());
		for(String key: map.keySet()) {
			System.out.println(map.get(key));
		}
		map.remove("이상무");
		System.out.println(map.keySet());

		for(String key : map.keySet()) {
			if(key.equals("이숭무")) {
				map.remove(key);
				break;
			}
		}
		System.out.println(map.keySet());
		/// map: put, get, remove, clear, size, isEmpty, keySet
	}
}