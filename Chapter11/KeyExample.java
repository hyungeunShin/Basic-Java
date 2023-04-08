package Chapter11;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 생성
		HashMap<Key, String> h = new HashMap<Key, String>();
		
		//식별키 new Key(1)로 홍길동 저장
		h.put(new Key(1), "홍길동");
		
		//식별키 new Key(1)로 읽어오기
		String s = h.get(new Key(1));
		System.out.println(s);
	}
}
