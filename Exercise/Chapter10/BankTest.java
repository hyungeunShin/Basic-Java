package Exercise.Chapter10;

public class BankTest {
	public static void main(String[] args) {
		CheckingAccount t = new CheckingAccount(3000);
		CheckingAccount s = new CheckingAccount(4000);
		//System.out.println(t.getBalance());
		try {
			t.transfer(5000, s);
			System.out.println("송금 완료");
		} catch (NullPointerException e) {
			System.out.println("해당하는 계좌가 없습니다");
			System.out.println("송금 실패");
		} catch (IllegalArgumentException e) {
			System.out.println("해당하는 금액을 보낼 수 없습니다");
			System.out.println("송금 실패");
		}
		
		try {
			t.transfer(2000, null);
			System.out.println("송금 완료");
		} catch (NullPointerException e) {
			System.out.println("해당하는 계좌가 없습니다");
			System.out.println("송금 실패");
		} catch (IllegalArgumentException e) {
			System.out.println("해당하는 금액을 보낼 수 없습니다");
			System.out.println("송금 실패");
		}
	}
}
