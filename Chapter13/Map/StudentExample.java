package Chapter13.Map;

import java.util.*;

public class StudentExample {
	public static void main(String[] args) {
		Map<Object, Object> m = new HashMap<>();
		
		m.put(new Student(1,"홍길동"), 95);
		m.put(new Student(1,"홍길동"), 95);
		
		//System.out.println(m.size());
		System.out.println(m.get(new Student(1,"홍길동")));  // equals와 hashcode 재정의 하지않으면 null
	}
}
