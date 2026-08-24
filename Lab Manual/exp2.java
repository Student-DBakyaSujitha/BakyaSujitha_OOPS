class BankAccount {

    // Attributes
    String accountHolder;
    int accountNumber;
    double balance;

    // Static member
    static String bankName = "ABC Bank";

    // Default Constructor
    BankAccount() {
        accountHolder = "Unknown";
        accountNumber = 0;
        balance = 0.0;
    }

    // Parameterized Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: Rs." + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to display account details
    void display() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Bank Name      : " + bankName);
        System.out.println("Balance        : Rs." + balance);
    }

    public static void main(String[] args) {

        // Object using default constructor
        BankAccount account1 = new BankAccount();

        // Object using parameterized constructor
        BankAccount account2 =
            new BankAccount("Suji", 1001, 5000.0);

        System.out.println("--- ACCOUNT 1 ---");
        account1.display();

        System.out.println("\n--- ACCOUNT 2 ---");
        account2.display();

        System.out.println("\n--- TRANSACTIONS ---");

        account2.deposit(2000);
        account2.withdraw(1000);

        System.out.println("\n--- UPDATED ACCOUNT DETAILS ---");
        account2.display();
    }
}