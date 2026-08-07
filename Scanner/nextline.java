import java.util.Scanner;

class scannernextline {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.println(address);

        sc.close();
    }
}
