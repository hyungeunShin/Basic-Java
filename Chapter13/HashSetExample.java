package Chapter13;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> s = new HashSet<>();
		
		s.add(new Student(1,"홍길동"));
		s.add(new Student(2,"신용권"));
		s.add(new Student(1,"조민우"));
		
//		Iterator<Student> i = s.iterator();
//		while(i.hasNext()) {
//			Student st = i.next();
//			System.out.println(st.stuNum + st.name);
//		}
		for (Student st : s) {
			System.out.println(st.stuNum + st.name);
		}
	}
}
