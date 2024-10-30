public class TestAccount {
    public static void main(String[] args) {
        // Kiểm tra lớp Customer
        Customer customer1 = new Customer(101, "John Doe", 'm');
        System.out.println(customer1);

        // Kiểm tra lớp Account
        Account account1 = new Account(1001, customer1, 500.0);
        System.out.println(account1);

        account1.deposit(150.0);
        System.out.println(account1);

        account1.withdraw(100.0);
        System.out.println(account1);

        account1.withdraw(600.0);
        System.out.println(account1);
    }
}
