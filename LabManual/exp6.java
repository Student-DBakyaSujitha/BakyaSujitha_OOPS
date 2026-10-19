package LabManual;

import java.util.ArrayList;
import java.util.Scanner;

public class exp6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<String> items = new ArrayList<>();

        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Add items
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item " + (i + 1) + ": ");
            String item = sc.nextLine();
            items.add(item);
        }

        // Display items
        System.out.println("\nItems in the collection:");
        for (String item : items) {
            System.out.println(item);
        }

        // Remove an item
        System.out.print("\nEnter item to remove: ");
        String removeItem = sc.nextLine();

        if (items.remove(removeItem)) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }

        // Display updated collection
        System.out.println("\nUpdated collection:");
        for (String item : items) {
            System.out.println(item);
        }

        sc.close();
    }
}