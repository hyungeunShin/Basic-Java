package Exercise.Chapter01_05;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		
		int num = new Random().nextInt(100) + 1;
		
		Scanner s = new Scanner(System.in);
		boolean run = true;
		int cnt = 0;
		
		while(run) {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			cnt++;
			int a = s.nextInt();
			
			if(num>a) {
				System.out.println("정답은 더 큰 수입니다.");
				
			} else if(num==a) {
				System.out.println("정답입니다.");				
				break;
			} else {
				System.out.println("정답은 더 작은 수입니다.");				
			}
			
		}		
		System.out.println("당신은 " + cnt + "번만에 맞히셨습니다.");	
		s.close();
	}
}
