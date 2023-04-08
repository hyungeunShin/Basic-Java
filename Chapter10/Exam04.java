package Chapter10;

public class Exam04 {
	public static void main(String[] args) {
		String[] arr = {"10", "2a"};
		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			try {
				value = Integer.parseInt(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스초과");
			} catch (NumberFormatException e) {
				System.out.println("숫자변환불가");
			} finally {
				System.out.println(value);
			}
		}
	}
}
