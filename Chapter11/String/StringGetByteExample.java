package Chapter11.String;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {
	public static void main(String[] args) {
		String s = "안녕하세요";
		
		byte[] bytes1 = s.getBytes();
		System.out.println("bytes1 길이 : " + bytes1.length);
		String s1 = new String(bytes1);
		System.out.println("bytes1의 문자 : " + s1);
		
		try {
			byte[] bytes2 = s.getBytes("EUC-KR");
			System.out.println("bytes2 길이 : " + bytes2.length);
			String s2 = new String(bytes2,"EUC-KR");
			System.out.println("bytes2의 문자 : " + s2);
			
			byte[] bytes3 = s.getBytes("UTF-8");
			System.out.println("bytes3 길이 : " + bytes3.length);
			String s3 = new String(bytes3,"UTF-8");
			System.out.println("bytes2의 문자 : " + s3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
