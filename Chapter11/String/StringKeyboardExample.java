package Chapter11.String;

import java.io.IOException;

public class StringKeyboardExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readbyte = System.in.read(bytes);  //예외처리
		
		String s = new String(bytes, 0, readbyte-2);
		System.out.println(s);
	}
}
