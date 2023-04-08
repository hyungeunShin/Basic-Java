package Chapter04;

import java.util.Random;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			Random r = new Random();
			int num = r.nextInt(6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램종료");
	}
}
