package Chapter10;

public class ThrowsExample {
	public static void main(String[] args) throws Exception {
		method();
		
		throw new Exception("실패");
		//예외 발생시키기    throw사용
		//throw new Exception();
		
	}
	
	//public static void method() throws ClassNotFoundException, ClassCastException {
	//	Class.forName("java.lang.String");
	//}
	
	public static void method() throws Exception {
		Class.forName("java.lang.String");
	}
}
