package Exercise.Chapter01_05;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		
	    System.out.print("수도입니까?(수도 :1, 수도아님: 0) ");
	    int city = s.nextInt();
		
		System.out.print("총 인구는?(단위: 만) ");
		int pop = s.nextInt();
		
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");
		int people = s.nextInt();
		
		String str = ((city == 1 && pop >= 100) || people >= 50) ? "이 도시는메트로폴리스입니다." : "이 도시는 메트로폴리스가 아닙니다.";
		System.out.println(str);
		s.close();
	}
}
