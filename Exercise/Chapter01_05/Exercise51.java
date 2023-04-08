package Exercise.Chapter01_05;

public class Exercise51 {
	public static void main(String[] args) {		
		int[] arr = {38,94,16,3,76,94,82,47,59,8};
		int max = 0;
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값: " + max);
		
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}	    
	    System.out.println("최소값: " + min);
	}
}
