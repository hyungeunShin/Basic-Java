package Chapter06;

public class MemberService {
	String id;
	String password;

	boolean login(String id, String password) {
		// if(id.equals("hong") && password.equals("12345")) {// id가 null이면 예외
		if ("hong".equals(id) && "12345".equals(password)) { // 더 안전한
			return true;
		}
		return false;
	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
}
