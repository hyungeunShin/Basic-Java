package Chapter07;

public class StudentExample {
	public static void main(String[] args) {
		int cnt = 0;
		Student s = new Student("홍길동", "123456-1234567", cnt++);
		Student s1 = new Student("홍길동", "123456-1234567", cnt++);
		
		System.out.println("name : " + s.name);
		System.out.println("ssn : " + s.ssn);
		System.out.println("stunum : " + s1.stunum);
		System.out.println(cnt);
	}
}
