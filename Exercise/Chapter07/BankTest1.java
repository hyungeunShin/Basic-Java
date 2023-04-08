package Exercise.Chapter07;

public class BankTest1 {
    public static void main(String[] args) {
        Bank1 bank = new Bank1();

        Customer1 customer1 = new Customer1("Tony", "Stark");
        customer1.setAccount(new BankAccount1(100_000));
        bank.addCustomer(customer1);

        Customer1 customer2 = new Customer1("Peter", "Parker");
        customer2.setAccount(new BankAccount1(100));
        bank.addCustomer(customer2);

        Customer1 customer3 = new Customer1("Thor", "Odinson");
        customer3.setAccount(new BankAccount1(30_000));
        bank.addCustomer(customer3);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Customer1 maxBalanceCustomer = null;
        Customer1 minBalanceCustomer = null;
        //System.out.println(bank.getNumberOfCustomers());
        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            Customer1 account = bank.getCustomer(i);
            if (account.getAccount().getBalance() > max) {
                max = account.getAccount().getBalance();
                maxBalanceCustomer = account;
            }
            if (account.getAccount().getBalance() < min) {
                min = account.getAccount().getBalance();
                minBalanceCustomer = account;
            }
        }
        System.out.println("잔고가 가장 많은 사람");
        //System.out.println(maxBalanceCustomer);
        System.out.println(maxBalanceCustomer.toString());
        System.out.println("잔고가 가장 적은 사람");
        System.out.println(minBalanceCustomer);
        if (maxBalanceCustomer.getAccount().transfer(max / 2, minBalanceCustomer.getAccount())) {
            System.out.println(maxBalanceCustomer.getFirstName() + "가 " + minBalanceCustomer.getFirstName() + "에게 잔고의 반을 송금");
        } else {
            System.out.println("송금되지 않았습니다.");
        }
        System.out.println("송금 후 모든 고객의 정보");
        for (Customer1 c : bank.getCustomers()) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }
}
