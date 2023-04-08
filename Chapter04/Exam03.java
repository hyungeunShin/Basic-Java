package Chapter04;

import java.util.Random;

public class Exam03 {
	public static void main(String[] args) {
		Random r = new Random();
		while(true) {
			int num1 = r.nextInt(6) + 1;
			int num2 = r.nextInt(6) + 1;
			
			System.out.printf("(%d,%d)", num1, num2);			
			if(num1 + num2 == 5) {				
				break;
			}
		}
	}
}
