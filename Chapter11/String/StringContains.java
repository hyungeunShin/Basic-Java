package Chapter11.String;

public class StringContains {
	public static void main(String[] args) {
		String s = "자바 프로그래밍";
		if(s.contains("자바")) {
			System.out.println("자바와 관련");
		} else {
			System.out.println("자바와 관련X");
		}
	}
}
