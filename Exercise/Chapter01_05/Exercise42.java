package Exercise.Chapter01_05;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12): ");
		int num = s.nextInt();
		
		if(3<=num && num<=5) {
			System.out.printf("%d월은 봄입니다.", num);
		} else if (6<=num && num<=8) {
			System.out.printf("%d월은 여름입니다.", num);
		} else if (9<=num && num<=11) {
			System.out.printf("%d월은 가을입니다.", num);
		} else if (num == 12 || num ==1 || num==2) {
			System.out.printf("%d월은 겨울입니다.", num);
		} else {
			System.out.printf("%d월은 잘못된 입력입니다.", num);
		}
		s.close();
	}
}
