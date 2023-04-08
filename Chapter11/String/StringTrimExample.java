package Chapter11.String;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "  010              ";
		String tel2 = "           1234              ";
		String tel3 = "              8888  ";
		System.out.println(tel1+tel2+tel3);
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
		
	}
}
