package Chapter10;

public class ArrayExceptionExample {
	public static void main(String[] args) {
//		String s1 = args[0];
//		String s2 = args[1];
//		System.out.println(s1);
//		System.out.println(s2);
		
		if(args.length == 2) {
			String s1 = args[0];
			String s2 = args[1];
			System.out.println(s1);
			System.out.println(s2);
		} else {
			System.out.println("불가능");
		}
	}
}
