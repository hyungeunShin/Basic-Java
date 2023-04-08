package Chapter05;

public class Exam05 {
	public static void main(String[] args) {
		int[][] arr = {{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum = 0;
		double avg = 0.0;
		//-------------------------------------------------------------------------------------
		int a = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				a++;
			}
		}
		
		avg = (double) sum / a;
		//avg = (double) sum / (arr[0].length + arr[1].length + arr[2].length);
		//------------------------------------------------------------------------------------
		System.out.println(sum);
		System.out.println(avg);
	}
}
