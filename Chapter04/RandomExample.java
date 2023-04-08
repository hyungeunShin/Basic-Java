package Chapter04;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//SecureRandom
		Random r = new Random();
		
		//int ranNum = r.nextInt(6) + 1;
		//           r.nextInt(숫자개수) + 시작값      
		//int ranNum2 = r.nextInt(6) + 1;
		
		for(int i = 1;i<=8;i++) {
			System.out.println(r.nextInt(6) + 1);
		}
		
		/*System.out.println(r.nextInt(6) + 1);
		System.out.println(r.nextInt(6) + 1);
		System.out.println(r.nextInt(6) + 1);
		System.out.println(r.nextInt(6) + 1);
		System.out.println(r.nextInt(6) + 1);
		System.out.println(r.nextInt(6) + 1);
		System.out.println(r.nextInt(6) + 1);
		System.out.println(r.nextInt(6) + 1);		
		System.out.println(ranNum1);       
		System.out.println(ranNum2);
		System.out.println(ranNum3);
		System.out.println(ranNum4);
		System.out.println(ranNum5);
		System.out.println(ranNum6);
		System.out.println(ranNum7);
		System.out.println(ranNum8);*/
	}
}
