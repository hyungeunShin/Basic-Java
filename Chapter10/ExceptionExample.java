package Chapter10;

public class ExceptionExample {
	public static void main(String[] args) {
		//일반예외
//		Class.forName("java.lang.String");
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//실행예외
		//String name = null;		
		//System.out.println(name.contains("홍"));
//		if(name != null) {
//			System.out.println(name.contains("홍"));
//		}
		
		String name1 = "aa";
		System.out.println(name1.contains("홍"));
	}
}
