package LabManual;

import java.io.*;
import java.util.Scanner;

public class exp10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter file name: ");
            String fileName = sc.nextLine();

            System.out.print("Enter text to write: ");
            String text = sc.nextLine();

            // Create and write to file
            FileWriter writer = new FileWriter(fileName);
            writer.write(text);
            writer.close();

            System.out.println("Data written successfully.");

            // Read from file
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            System.out.println("\nFile Contents:");
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}