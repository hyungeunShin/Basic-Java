package Chapter11.String;

public class StringLengthExample {
	public static void main(String[] args) {
		String s = "7306241230123";
		int l = s.length();
		if(l == 13) {
			System.out.println("자리수가 맞음");
		} else {
			System.out.println("자리수가 틀림");
		}
	}
}
