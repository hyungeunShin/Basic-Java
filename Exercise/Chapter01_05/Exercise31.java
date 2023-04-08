package Exercise.Chapter01_05;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int a = s.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		int b = s.nextInt();
		
		int bigNum = ((a+b) + Math.abs(a-b)) / 2;
		int smallNum = ((a+b) - Math.abs(a-b)) / 2;
		System.out.printf("큰 수를 작은 수로 나눈 몫은 %d이고, 나머지는 %d이다.", bigNum/smallNum, bigNum%smallNum);
		s.close();
	 }
 }
 