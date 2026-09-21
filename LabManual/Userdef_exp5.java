//User defined exception by getting input from user 
package LabManual;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class Userdef_exp5 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Enter your balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        try {
            if (withdraw > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient balance!"
                );
            }

            balance = balance - withdraw;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }

        catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();

        }
    }
}
