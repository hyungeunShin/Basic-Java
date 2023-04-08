package Exercise.Chapter01_05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();		
		
		System.out.print("가위바위보를 입력하세요 : ");
		String a = s.nextLine();				
		
		System.out.println("게이머: " + a);		
		
		String[] arr = {"주먹","가위","보"};
		String b = arr[r.nextInt(3)];
		
		System.out.println("인공지능 컴퓨터: " + b);
		
		if(a.equals(b)) {
			System.out.println("결과: 비겼습니다.");
		} else if((a.equals("주먹") && b.equals("가위")) || (a.equals("가위") && b.equals("보")) || (a.equals("보") && b.equals("주먹"))) {
			System.out.println("결과: 게이머가 이겼습니다.");
		} else {
			System.out.println("결과: 컴퓨터가 이겼습니다.");
		}
		s.close();
	}
}
