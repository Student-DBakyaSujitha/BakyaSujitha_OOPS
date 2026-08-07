import java.util.Scanner;

class ScannerNextInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Age = " + age);

        sc.close();
    }
}
