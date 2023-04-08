package Chapter06;

public class PersonExample {
	public static void main(String[] args) {
		Person p = new Person("123456-1234567", "홍길동");
		
		p.print();
		p.name = "김길동";
		p.print();
	}
}
