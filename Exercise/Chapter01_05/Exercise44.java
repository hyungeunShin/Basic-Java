package Exercise.Chapter01_05;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("가위바위보 게임");
		
		System.out.print("철수: ");
		String a = s.nextLine();
		
		System.out.print("영희: ");
		String b = s.nextLine();
		
		if(a.equals(b)) {
			System.out.println("결과: 비겼습니다.");
		} else if((a.equals("주먹") && b.equals("가위")) || (a.equals("가위") && b.equals("보")) || (a.equals("보") && b.equals("주먹"))) {
			System.out.println("결과: 철수가 이겼습니다.");
		} else {
			System.out.println("결과: 영희가 이겼습니다.");
		}
		s.close();
	}
}
