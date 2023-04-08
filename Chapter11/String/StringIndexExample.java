package Chapter11.String;

public class StringIndexExample {
	public static void main(String[] args) {
		String s = "자바 프로그래밍";
		
		int location = s.indexOf("프로그래밍");
		System.out.println(location);
		
		if(s.indexOf("자바") != -1) {
			System.out.println("자바와 관련");
		} else {
			System.out.println("자바와 관련X");
		}
	}
}
