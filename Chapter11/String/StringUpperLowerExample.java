package Chapter11.String;

public class StringUpperLowerExample {
	public static void main(String[] args) {
		String s = "Java Programming";
		String s2 = "JAVA Programming";
		
		System.out.println(s.equals(s2));
		
		String lower1 = s.toLowerCase();
		String lower2 = s2.toLowerCase();
		System.out.println(lower1);
		System.out.println(lower2);
		System.out.println(lower1.equals(lower2));
		
		String a = s.toUpperCase();
		System.out.println(a);
		
		System.out.println(s.equalsIgnoreCase(s2));
	}
}
