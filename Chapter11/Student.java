package Chapter11;

import java.util.Objects;

public class Student {
	private String num;
	
	public Student(String num) {
		this.num = num;
	}
	
	public String getNum() {
		return num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
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
		return Objects.equals(num, other.num);
	}
	
}
