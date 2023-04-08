package Exercise.Chapter10;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("어떤 수를 나누시겠습니까? ");
				String s1 = s.nextLine();
				int a = Integer.parseInt(s1);
				System.out.print("어떤 수를 나누시겠습니까? ");
				String s2 = s.nextLine();
				int b = Integer.parseInt(s2);
				int result = a / b;
				System.out.println(result);
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
		}
		s.close();
	}
}
