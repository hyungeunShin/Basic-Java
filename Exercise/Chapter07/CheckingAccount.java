package Exercise.Chapter07;

public class CheckingAccount extends BankAccount2 {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

	/*
	 * s:10000 c:5000 
	 * 2000 
	 * 7000
	 * 17000
	 */
	@Override
	public boolean withdraw(int amount) {
		if (protectedBy.balance + balance > amount) {
			if (super.withdraw(amount)) {
				balance -= amount;
			} else {
				//balance -= amount;
				//protectedBy.balance += balance;
				protectedBy.withdraw(amount - balance);
				balance = 0;
			}
			return true;
		}
		return false;
	}
}
