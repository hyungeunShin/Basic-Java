package Exercise.Chapter01_05;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int a = s.nextInt();
		
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int b = s.nextInt();
		
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int c = s.nextInt();
		
		if(a<b+c && a>b && a>c) {
			System.out.println("삼각형을 만들 수 있습니다.");
		} else if(b<a+c && b>a && b>c) {
			System.out.println("삼각형을 만들 수 있습니다.");
		} else if(c<a+b && c>a && c>b){
			System.out.println("삼각형을 만들 수 있습니다.");
		} else if(a==b && b==c) {
			System.out.println("삼각형을 만들 수 있습니다.");
		} else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
		s.close();
	}
}
