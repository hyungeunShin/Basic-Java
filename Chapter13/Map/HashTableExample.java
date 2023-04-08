package Chapter13.Map;

import java.util.*;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		
		m.put("aaa", "12");
		m.put("bbb", "12");
		m.put("ccc", "12");
		m.put("ddd", "12");
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = s.nextLine();
		System.out.print("패스워드: ");
		String password = s.nextLine();
		
		if(m.containsKey(id)) {
			if(m.get(id).equals(password)) {
				System.out.println("로그인");
			} else {
				System.out.println("비밀번호 틀림");
			}
		} else {
			System.out.println("아이디틀림");
		}
		s.close();
	}
}

