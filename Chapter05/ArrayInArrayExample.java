package Chapter05;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		for(int i=0; i<a.length; i++) {
			for(int k=0; k<a[i].length; k++) {
				a[i][k] += i+k; 
				System.out.println("a[" + i + "][" + k + "]=" + a[i][k]);
			}
		}
		System.out.println();
		
		int[][] b = new int[2][];  
		b[0] = new int[2];
		b[1] = new int[3];
		for(int i=0; i<b.length; i++) {
			for(int k=0; k<b[i].length; k++) {
				System.out.println("b[" + i + "][" + k + "]=" + b[i][k]);
			}
		}
		System.out.println();
		
		int[][] c = {{95,80},{92,96,80}};
		for(int i=0; i<c.length; i++) {
			for(int k=0; k<c[i].length; k++) {
				System.out.println("c[" + i + "][" + k + "]=" + c[i][k]);
			}
		}
	}
}
