package Exercise.Chapter01_05;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {		
		int[] arr2 = new int[45];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i+1;
		}
		
		Random r = new Random();
		int temp = 0;			
		
		for (int i = 0; i < arr2.length; i++) {
			int random = r.nextInt(45);  //0~44			
			temp = arr2[i];    
			arr2[i] = arr2[random]; 
			arr2[random] = temp;						
		}	
		
		//중복제거
		/*int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
		arr[i] = r.nextInt(45) + 1;			
		for(int j = 0; j < i; j++) {
			if(arr[i] == arr[j]) {
				i--;
				break;
			} 
		}*/
		for (int i = 0; i < arr2.length; i++) {
			if(i != 0) {
				System.out.print(", ");
				}
			System.out.print(arr2[i]);
		}
	}
}
