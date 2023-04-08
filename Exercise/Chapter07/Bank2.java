package Exercise.Chapter07;

public class Bank2 {
	private Customer2[] customers;
	private int numberOfCustomers;

	public Bank2() {
		customers = new Customer2[10];
	}

	public void addCustomer(Customer2 customer) {
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}

	public Customer2[] getCustomers() {
		return customers;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer2 getCustomer(int index) {
		return customers[index];
	}
}
