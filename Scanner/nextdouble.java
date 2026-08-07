import java.util.Scanner;

public class nextdouble {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.println("Salary = " + salary);

        sc.close();
    }
}
