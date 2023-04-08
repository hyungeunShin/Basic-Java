package Chapter13.Map;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		m.put("가가", 85);
		m.put("나나", 90);
		m.put("다다", 80);
		m.put("나나", 95);
		System.out.println(m.size());
		System.out.println(m.get("나나"));  // 마지막 95출력
		
		//1. 엔트리로 접근
		Set<Entry<String, Integer>> e = m.entrySet();
		Iterator<Entry<String, Integer>> ei = e.iterator(); // => while로 접근
		while (ei.hasNext()) {
			Map.Entry<String, Integer> entry = ei.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
		
		for (Entry<String, Integer> entry : e) {           //foreach 문으로 접근
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
		
		
		//2. key로 접근
		Set<String> k = m.keySet();
		Iterator<String> ki = k.iterator();
		while (ki.hasNext()) {
			String key = ki.next();
			Integer value = m.get(key);
			System.out.println(key + ": " + value);
		}
		System.out.println();
		
		for (String key : k) {
			System.out.println(key + ": " + m.get(key));
		}
		System.out.println();
		
		
		//3. value로 접근 -> key값은 모른다
		Collection<Integer> values = m.values();
		List<Integer> list = new ArrayList<>(values);
		System.out.println(list);
		
		for (Integer value : values) {
			System.out.println(value);
		}
	}
}
