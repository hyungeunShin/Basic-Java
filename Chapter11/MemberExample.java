package Chapter11;

import java.util.Objects;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("blue","12");
		Member m2 = new Member("blue","12");
		Member m3 = new Member("red","12");
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		
		System.out.println(Objects.hash("blue"));
		System.out.println(Objects.hash("blue"));
		System.out.println(Objects.hash("red"));
		
		Member m = new Member("Blue", "이파란");
		System.out.println(m);
	}
}
