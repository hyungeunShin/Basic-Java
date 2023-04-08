package Chapter13.Set;

import java.util.*;

public class MemberExample {
	public static void main(String[] args) {
		Set<Object> s = new HashSet<>();
		
		s.add(new Member("홍길동",30));
		s.add(new Member("홍길동",30));
		// hashcode와 equals를 재정의 하지 않으면 2개가 출력
		
		System.out.println(s.size());
	}
}
