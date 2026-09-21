package LabManual;
import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Data types
        String name;
        int mark1, mark2, mark3;
        int total;
        double average;
        char grade;

        // User Input
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        mark3 = sc.nextInt();

        // Arithmetic operators
        total = mark1 + mark2 + mark3;
        average = total / 3.0;

        // Control statements
        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40) {

            if (average >= 90)
                grade = 'A';
            else if (average >= 75)
                grade = 'B';
            else if (average >= 60)
                grade = 'C';
            else
                grade = 'D';

            System.out.println("\n--- STUDENT RESULT ---");
            System.out.println("Name    : " + name);
            System.out.println("Total   : " + total);
            System.out.println("Average : " + average);
            System.out.println("Result  : PASS");
            System.out.println("Grade   : " + grade);

        } else {

            System.out.println("\n--- STUDENT RESULT ---");
            System.out.println("Name    : " + name);
            System.out.println("Total   : " + total);
            System.out.println("Average : " + average);
            System.out.println("Result  : FAIL");
            System.out.println("Grade   : F");
        }

        sc.close();
    }
}