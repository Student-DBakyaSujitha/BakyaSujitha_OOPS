package LabManual;
import java.util.Scanner;

class BankAccount7 {
    private double balance;

    BankAccount7(double balance) {
        this.balance = balance;
    }

    // Synchronized deposit method
    synchronized void deposit(double amount) {
        balance = balance + amount;
        System.out.println(
            Thread.currentThread().getName()
            + " deposited: Rs." + amount
        );
        System.out.println("Balance after deposit: Rs." + balance);
    }

    // Synchronized withdrawal method
    synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(
                Thread.currentThread().getName()
                + " withdrew: Rs." + amount
            );
            System.out.println(
                "Balance after withdrawal: Rs." + balance
            );
        } else {
            System.out.println(
                Thread.currentThread().getName()
                + ": Insufficient balance!"
            );
        }
    }

    synchronized double getBalance() {
        return balance;
    }
}

class BankTask7 extends Thread {
    BankAccount7 account;
    double amount;
    boolean isDeposit;

    BankTask7(BankAccount7 account, double amount,
              boolean isDeposit, String name) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
        setName(name);
    }

    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class exp7 {
    public static void main(String[] args)
            throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: Rs.");
        double balance = sc.nextDouble();

        System.out.print("Enter deposit amount: Rs.");
        double depositAmount = sc.nextDouble();

        System.out.print("Enter withdrawal amount: Rs.");
        double withdrawAmount = sc.nextDouble();

        if (balance < 0 || depositAmount < 0
                || withdrawAmount < 0) {
            System.out.println("Enter valid non-negative amounts.");
            sc.close();
            return;
        }

        BankAccount7 account = new BankAccount7(balance);

        BankTask7 t1 = new BankTask7(
            account, depositAmount, true, "Deposit Thread"
        );

        BankTask7 t2 = new BankTask7(
            account, withdrawAmount, false, "Withdrawal Thread"
        );

        System.out.println("\n--- TRANSACTIONS STARTED ---");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\n--- TRANSACTIONS COMPLETED ---");
        System.out.println(
            "Final Account Balance: Rs." + account.getBalance()
        );

        sc.close();
    }
}