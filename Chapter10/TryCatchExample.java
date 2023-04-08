package Chapter10;

public class TryCatchExample {
	public static void main(String[] args) {
//		try {
//			System.out.println("시작");
//			Class.forName("java.lang.String");
//			System.out.println("끝");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("다시 입력");
//		}
		
		try {
			System.out.println("시작");
			Class.forName("java.lllllllang.String");
			//System.out.println("끝");
			return;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("다시 입력");
			return;
		} finally {
			System.out.println("끝");
		}
	}
}
