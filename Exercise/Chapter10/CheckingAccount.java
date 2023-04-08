package Exercise.Chapter10;

public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}

	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}

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
	
	@Override
	public String getAccountType() {
		return "당좌예금";
	}
}
