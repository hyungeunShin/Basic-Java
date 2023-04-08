package Chapter10;

import java.util.Scanner;

public class TryWithResource {
	public static void main(String[] args) {
		// JDK 1.7이상 사용가능

		// Scanner scanner = null;
		try (Scanner scanner = new Scanner(System.in)) {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			int result = n1 + n2;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			if(scanner != null) {
//				scanner.close();			
//			}
		}

		try (Scanner scanner = new Scanner(System.in)) {
			int n1 = scanner.nextInt();
			int n2 = scanner.nextInt();
			int result = n1 + n2;
			System.out.println(result);
			//scanner.close()   불필요
		}

	}
}
