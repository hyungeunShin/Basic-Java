package Exercise.Chapter01_05;

import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
		Random r = new Random();		
		
		int[] a = new int[6];
		
		for (int i = 0; i <= 10000 ; i++) {
			int j = r.nextInt(6);
			a[j]++;
		}
				
		System.out.println("------------");
		System.out.println("면\t빈도");
		System.out.println("------------");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+1 + "\t" + a[i]);
		}
		
		/*for (int i = 0; i < 10000; i++) {
			int num = r.nextInt(6)+1;
			if(num == 1) {
				a[0]++;
			} else if(num == 2) {
				a[1]++;
			} else if(num == 3) {
				a[2]++;
			} else if(num == 4) {
				a[3]++;
			} else if(num == 5) {
				a[4]++;
			} else {
				a[5]++;
			}			
		}		
		for(int i =0; i<a.length; i++) {
			System.out.println(i+1 + "\t" + a[i]);
		}*/		
	}
}
