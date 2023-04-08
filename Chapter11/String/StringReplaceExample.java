package Chapter11.String;

public class StringReplaceExample {
	public static void main(String[] args) {
		String s = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다";
		String s2 = s.replace("자바", "JAVA");
		System.out.println(s);
		System.out.println(s2);
		//정규표현식(Regular Expression) 패턴을 저장, 매치
	}
}
