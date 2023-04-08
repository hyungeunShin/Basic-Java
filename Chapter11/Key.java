package Chapter11;

import java.util.Objects;

public class Key {
	private int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Key)) {
			return false;
		}
		Key other = (Key) obj;
		return number == other.number;
	}

	@Override
	public String toString() {
		return String.format("Key [number=%s]", number);
	}	
}
