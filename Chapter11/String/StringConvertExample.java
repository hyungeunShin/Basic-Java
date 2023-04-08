package Chapter11.String;

public class StringConvertExample {
	public static void main(String[] args) {
		String s = "200";
		
		int a = Integer.parseInt(s);
		System.out.println(a);
		
		int b = 150;
		
		String ss = b+"";
		System.out.println(ss);
		
		String ss2 = String.valueOf(b);
		System.out.println(ss2);
	}
}
