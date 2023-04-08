package Chapter11.String;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		String s = "모든 프로그램은 자바 언어로 개발될 수 있다";
//		int index = s.indexOf("자바");
//		if(index == -1) {
//			System.out.println("관련x");
//		} else {
//			System.out.println("포함");
//			s = s.replace("자바", "Java");
//			System.out.println(s);
//		}
		if(s.contains("자바")) {
			System.out.println("포함");
			s = s.replace("자바", "Java");
			System.out.println(s);
		} else {
			System.out.println("관련x");
		}
	}
}
