package Exercise.Chapter01_05;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		System.out.print("프로그래밍 기초: ");
		int a = s.nextInt();
		
		System.out.print("데이터베이스: ");
		int b = s.nextInt();
		
		System.out.print("화면 구현: ");
		int c = s.nextInt();
		
		System.out.print("애플리케이션 구현: ");
		int d = s.nextInt();   //double
		
		System.out.print("머신러닝: ");
		int e = s.nextInt();
		
		int sum = a+b+c+d+e;
		float avg = (float) sum / 5;
		
		if(avg>=90) {
			System.out.println("총점: " + sum);
			System.out.printf("평균: %.2f\n", avg);
			System.out.println("학점: A");
		} else if(avg>=80 && avg<90) {
			System.out.println("총점: " + sum);
			System.out.printf("평균: %.2f\n", avg);
			System.out.println("학점: B");
		} else if(avg>=70 && avg<80) {
			System.out.println("총점: " + sum);
			System.out.printf("평균: %.2f\n", avg);
			System.out.println("학점: C");
		} else if(avg>=60 && avg<70) {
			System.out.println("총점: " + sum);
			System.out.printf("평균: %.2f\n", avg);
			System.out.println("학점: D");
		} else {
			System.out.println("총점: " + sum);
			System.out.printf("평균: %.2f\n", avg);
			System.out.println("학점: F");
		}
		s.close();
	}
}
