package Exercise.Chapter07;

public class StudentTest {
	public static void main(String[] args) {
		Human h = new Human("Steve", 30);
		System.out.println(h);
		
		Student s = new Student("Parker", 23, "Physics");
		System.out.println(s);
		
		s.setName("Peter");
		s.setAge(19);
		s.setMajor("Computer Science");
		
		System.out.print("이름: " + s.getName() + ", ");
		System.out.print("나이: " + s.getAge() + ", ");
		System.out.print("전공: " + s.getMajor());
		
	}
}
