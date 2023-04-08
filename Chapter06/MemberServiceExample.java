package Chapter06;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService m = new MemberService();
		boolean result = m.login("hong", "12345");
		if(result) {
			System.out.println("로그인되었습니다");
			m.logout("hong");
		} else {
			System.out.println("id 또는 password가 틀렸습니다");
		}
	}
}
