package LabManual;

import java.util.Scanner;

// User-defined exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class exp5 {

    static void checkAge(int age)
            throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                "Age must be 18 or above to vote."
            );
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User-defined exception
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(
                "User-defined Exception: " + e.getMessage()
            );
        }

        // Built-in exception
        try {
            System.out.print("Enter numbers to divide: ");
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();

            System.out.print("Enter the second number: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(
                "Built-in Exception: Cannot divide by zero."
            );
        }

        sc.close();
    }
}