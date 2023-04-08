package Chapter04;

public class Exam06 {
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {        //별의 개수
			for(int j=1;j<=i ;j++) {  //줄의 개수
				System.out.print("*");
				if(j==i)
				System.out.println();
			}
		}
	}
}
