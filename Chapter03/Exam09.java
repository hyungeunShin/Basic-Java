package Chapter03;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		double firstNum = s.nextDouble();
		System.out.print("두 번째 수: ");		
		double secondNum = s.nextDouble();
		
		System.out.println("-------------------------------");
		
		//String result = (secondNum == 0 || secondNum == 0.0) ? "결과: 무한대" : "결과: " + String.valueOf(firstNum / secondNum);
		String result = (secondNum == 0 || secondNum == 0.0) ? "결과: 무한대" : "결과: " + (firstNum / secondNum);
		
		System.out.println(result);
		/*if(secondNum == 0.0) {
			System.out.println("결과: 무한대");			
		} else {
			System.out.println(result);
		}*/
		s.close();
	}
}
