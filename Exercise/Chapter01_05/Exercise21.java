package Exercise.Chapter01_05;

import java.util.Scanner;

public class Exercise21 
{	
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);	
				
		System.out.print("가로의 길이는?(단위: m): ");
		String str1 = s.nextLine();
		
		System.out.print("세로의 길이는?(단위: m): ");
		String str2 = s.nextLine();
		
		double width = Double.parseDouble(str1);
		double height = Double.parseDouble(str2);
		
		double area = width * height;
		double perimeter = 2*(width+height);
		
		System.out.println("직사각형의 넓이 : " + area);
		System.out.println("직사각형의 둘레 : " + perimeter);
		s.close();
	}
}
