package LabManual;

import java.util.Scanner;

// Generic class
class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class exp8 {

    // Generic method
    public static <T> void show(T data) {
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Generic class objects
        Box<Integer> b1 = new Box<>(number);
        Box<String> b2 = new Box<>(text);

        System.out.println("\n--- GENERIC CLASS ---");
        b1.display();
        b2.display();

        System.out.println("\n--- GENERIC METHOD ---");
        show(number);
        show(text);

        sc.close();
    }
}