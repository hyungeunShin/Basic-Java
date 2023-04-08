package Exercise.Chapter01_05;

import java.util.Scanner;

public class Exercise25 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수: ");
		int num1 = s.nextInt();
		
		System.out.print("100원짜리 동전의 갯수: ");
		int num2 = s.nextInt();
		
		System.out.print("50원짜리 동전의 갯수: ");
		int num3 = s.nextInt();
		
		System.out.print("10원짜리 동전의 갯수: ");
		int num4 = s.nextInt();		
	
		int result = 500*num1 + 100*num2 + 50*num3 + 10*num4;
		
		System.out.printf("저금통 안의 동전의 총 액수 : %d", result);		
		s.close();
	}
}
