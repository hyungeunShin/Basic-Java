package Exercise.Chapter07;

public class Customer1 {
	private String firstName;
	private String lastName;
	private BankAccount1 account;

	public Customer1(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount1 getAccount() {
		return account;
	}

	public void setAccount(BankAccount1 account) {
		this.account = account;
	}	

	public String toString() {
		return "고객이름: " + firstName + " " + lastName + " 잔액: " + account.getBalance();
	}

}
