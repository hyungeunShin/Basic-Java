package Chapter11.String;

public class StringEqualsExample {
	public static void main(String[] args) {
		String s = new String("김");
		String s2 = "김";
		
		if(s == s2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(s.equals(s2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
