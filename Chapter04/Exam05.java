package Chapter04;

public class Exam05 {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {                //별의 개수
			for (int j = 4; j >= 0; j--) {    //줄의 개수
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
