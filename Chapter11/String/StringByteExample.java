package Chapter11.String;

public class StringByteExample {
	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		String s1 = new String(bytes);
		System.out.println(s1);
		
		String s2 = new String(bytes,6,4);
		System.out.println(s2);
	}
}
