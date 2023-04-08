package Chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample_Reflection {
	public static void main(String[] args) throws Exception {
		Class c = Member.class;
		//Class<Member> c2 = Member.class;
		Class c1 = Class.forName("Chapter11.Member");
		System.out.println(c.getName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getPackage().getName());
		
		Member m = new Member("1","2");
		//m.id = "a"; 접근 불가
		m.setId("a");
		
		//private도 접근 가능
		Constructor[] con = c.getConstructors();
		Member member = null;
		for (Constructor constructor : con) {
			member = (Member) constructor.newInstance("1","2");
		}
		System.out.println("id 값: " + member.getId());
		
		Field[] d = c.getDeclaredFields();
		for (Field field : d) {
			System.out.println("필드명 : " + field.getName());
			System.out.println("필드타입 : " + field.getType());
			field.setAccessible(true);
			field.set(member, "123");
		}
		System.out.println("id 값: " + member.getId());
		System.out.println("password 값: " + member.getName());
		
		Method[] d1 = c.getDeclaredMethods();
		for (Method method : d1) {
			System.out.println("메소드명 : " + method.getName());
			System.out.println("리턴타입 : " + method.getReturnType());
		}
	}
}
