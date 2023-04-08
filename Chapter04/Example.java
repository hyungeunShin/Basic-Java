package Chapter04;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("층수입력: ");
		
		int num = s.nextInt();
		for(int i = 0;i<num;i++) {
			for(int k=1; k<num-i;k++) {
				System.out.print(" ");
			}
			for (int j=0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}
}
