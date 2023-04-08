package Chapter06;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	Person(String ssn, String name) {
		this.name = name;
		this.ssn = ssn;
	}
	void print() {
		System.out.println(nation + ssn + name);
	}
}
