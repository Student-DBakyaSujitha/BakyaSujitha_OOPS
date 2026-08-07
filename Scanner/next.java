import java.util.Scanner;

class ScannerNext {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("Name = " + name);

        sc.close();
    }
}