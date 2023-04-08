package Chapter11;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		HashMap<Student, String> h = new HashMap<Student, String>();
		h.put(new Student("1"), "95");
		
		String score = h.get(new Student("1"));
		System.out.println(score);
	}
}
