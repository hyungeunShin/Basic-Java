package Chapter04;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner s = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			int num = s.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("예금액> ");
				int input = s.nextInt();
				balance += input;
				break;
				
			case 2:
				System.out.print("출금액> ");
				int output = s.nextInt();				
				balance -= output;
				break;
				
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
				
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		s.close();
	}
}
