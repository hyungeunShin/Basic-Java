package Chapter11;

import java.util.Objects;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String password) {
		this.id = id;
		this.name = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String password) {
		this.name = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
//	@Override
//	public boolean equals(Object obj) {
//		if(super.equals(obj)) {         //this == obj 같은 말  super.equals(obj)
//			return true;
//		}
//		if(!(obj instanceof Member)) {
//			return false;
//		} 
//		Member m = (Member) obj;
//		return id.equals(m.id);		

	// if(obj instanceof Member) {
//			Member m = (Member) obj;
//			if(id.equals(m.id)) {
//				return true;
//			}
//		}
	// return false;
//	}
	@Override
	public String toString() {
		return id + ": " + name;
	}
}
