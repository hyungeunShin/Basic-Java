package Chapter13.Set;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		s.add("Java");
		s.add("JDBC");
		s.add("Servlet");
		s.add("Java");
		s.add("iBATIS");
		s.add("Database");
		
		//모든 원소에 접근해서 데이터 가져오기
		Iterator<String> iterator = s.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		// 같은 코드
		for (String str : s) {
			System.out.println(str);
		}
	}
}
