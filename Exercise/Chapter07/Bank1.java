package Exercise.Chapter07;

public class Bank1 {
	private Customer1[] customers;
	private int numberOfCustomers;

	public Bank1() {
		customers = new Customer1[10];
	}

	public void addCustomer(Customer1 customer) {
		//customers[numberOfCustomers] = customer;
		//numberOfCustomers++;
		customers[numberOfCustomers++] = customer;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer1[] getCustomers() {
		return customers;
	}

	public Customer1 getCustomer(int index) {
		return customers[index];
	}
}
