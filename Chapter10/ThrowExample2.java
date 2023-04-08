package Chapter10;

public class ThrowExample2 {
	public static void method() throws ClassNotFoundException {
		Class.forName("java.lang.String");
		//throw new Exception();
		throw new ClassNotFoundException();
		//throw new IllegalArgumentException();
		//throw new NullPointerException();
		//throw new RuntimeException();
		//Exception e = new Exception();
	}

	public static void main(String[] args) {
		try {
			method();
			System.out.println("aaaaaa");
		//	throw new Exception();
		} catch(ClassNotFoundException e) {
			System.out.println("rrrrrr");
			//e.printStackTrace();
		}
	}
}
