package Exercise.Chapter07;

public class Customer2 {
	private String firstName;
	private String lastName;
	private BankAccount2[] accounts;
	private int numberOfAccounts;

	public Customer2(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount2[5];
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public BankAccount2 getAccount(int index) {
		return accounts[index];
	}

	public void addAccount(BankAccount2 account) {
		accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}	

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public String toString() {
		return "고객이름: " + firstName + " " + lastName + " 계좌의 개수: " + getNumberOfAccounts();
	}

}
