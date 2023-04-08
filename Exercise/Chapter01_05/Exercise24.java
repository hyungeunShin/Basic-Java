package Exercise.Chapter01_05;

import java.util.Scanner;

public class Exercise24 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오.(단위: cm): ");
		String str1 = s.nextLine();
		
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		String str2 = s.nextLine();
		
		double radius  = Double.parseDouble(str1);
		double height = Double.parseDouble(str2);
		
		double area = radius * radius * Math.PI;
		double volume = area * height;
		
		System.out.printf("원기둥 밑변의 넓이는 %.17fcm^2이고, 원기둥의 부피는 %.17fcm^3이다.", area, volume);	
		s.close();
	}
}
