package Chapter13;

import Chapter11.Member;

public class BoxExample {
	public static void main(String[] args) {
		//Generic  런타임때 타입결정
		Box<String> box = new Box<String>("1");
		box.getValue(); // String 타입으로 반환
		
		Box<Integer> box2 = new Box<Integer>(1);
		box2.getValue(); // Int 타입으로 반환
		
		//jdk 1.7부터 <> 안에 생략가능
		Box<Member> box3 = new Box<>(new Member("1","1"));
		box3.getValue();
		
		method(new Box<>("1"));		
	}
	
	public static void method(Box<String> box) {
		String boxValue = (String) box.getValue();
		System.out.println(boxValue);
	}
}
