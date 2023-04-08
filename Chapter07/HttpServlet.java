package Chapter07;

public abstract class HttpServlet {
	public abstract void service();
}

class HttpExample {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FiledownloddServlet());
	}	
	public static void method(HttpServlet h) {
		h.service();
	}
}

class FiledownloddServlet extends HttpServlet {
	@Override
	public void service() {
		System.out.println("파일 다운로드합니다");
	}
}

class LoginServlet extends HttpServlet {
	@Override
	public void service() {
		System.out.println("로그인합니다");
	}
}
