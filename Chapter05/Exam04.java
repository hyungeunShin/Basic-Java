package Chapter05;

public class Exam04 {
	public static void main(String[] args) {
		int max = 0;
		int[] arr = {1,5,3,8,2};
	    
		for (int i = 0; i < arr.length; i++) {
			//max = (max>arr[i]) ? max : arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("max: " + max);
		
	    /*for(int i=0; i<arr.length-1; i++) {                      
	        for(int j=i+1; j<arr.length; j++) {                  
	            if(arr[i]>arr[j]) {                              
	                int temp = arr[j];
	                arr[j] = arr[i];
	                arr[i] = temp;
	            }
	        }
	    }
	    max = arr[4];
	    System.out.println(max);*/		
	}
}
