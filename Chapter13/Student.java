package Chapter13;

import java.util.Objects;

public class Student {
	int stuNum;
	String name;
	
	public Student(int stuNum, String name) {
		this.stuNum = stuNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(stuNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return stuNum == other.stuNum;
	}	
}
