package Chapter11.String;

public class StringCharExample {
	public static void main(String[] args) {
		String s = "010624-1230123";
		char sex = s.charAt(7);
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
	}
}
