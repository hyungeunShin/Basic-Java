package Exercise.Chapter10;

public abstract class BankAccount {
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public boolean withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public boolean transfer(int amount, BankAccount otherAccount) { // throws ...
		if(amount < 0 || this.balance < amount) {
			throw new IllegalArgumentException();
		}
		if(otherAccount == null) {
			throw new NullPointerException();
		}
		withdraw(amount);
		otherAccount.deposit(amount);
		return true;
	}

	public String toString() {
		return "" + balance;
	}

	public String getAccountType() {
		return null;
	}
}
