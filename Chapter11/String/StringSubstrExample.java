package Chapter11.String;

public class StringSubstrExample {
	public static void main(String[] args) {
		String s = "880815-1234567";
		
		String regno1 = s.substring(0, 6);
		System.out.println(regno1);
		String regno2 = s.substring(7);
		System.out.println(regno2);
	}
}
