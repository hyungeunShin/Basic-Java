package Chapter11.String;

import java.util.Arrays;

public class BytesToStringExample {
	public static void main(String[] args) {
		byte[] b = {73,32,108,111,118,101,32,121,111,117};
		String s = new String(b);
		System.out.println(s);
		
		String s2 = "you love me";
		byte[] b2 = s2.getBytes();
		System.out.println(Arrays.toString(b2));
		
		String s3 = "한글도 가능합니다";
		byte[] b3 = s3.getBytes();
		System.out.println(Arrays.toString(b3));
	}
}
