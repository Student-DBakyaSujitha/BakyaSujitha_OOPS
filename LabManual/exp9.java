package LabManual;

import java.sql.*;
import java.util.Scanner;

// Singleton Design Pattern
class LibraryDB9 {

    private static Connection con;

    private LibraryDB9() {
    }

    public static Connection getConnection()
            throws SQLException {

        if (con == null || con.isClosed()) {
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library_db",
                "root",
                "1234"
            );
        }

        return con;
    }
}

public class exp9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = LibraryDB9.getConnection();

            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            System.out.print("Enter Book Price: ");
            double price = sc.nextDouble();

            String query =
                "INSERT INTO books VALUES (?, ?, ?, ?)";

            PreparedStatement ps =
                con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, author);
            ps.setDouble(4, price);

            ps.executeUpdate();

            System.out.println(
                "\nBook added successfully!"
            );

            // Display all books
            Statement st = con.createStatement();

            ResultSet rs =
                st.executeQuery("SELECT * FROM books");

            System.out.println("\n--- LIBRARY BOOKS ---");

            while (rs.next()) {
                System.out.println(
                    "Book ID: " + rs.getInt("book_id")
                    + ", Name: " + rs.getString("book_name")
                    + ", Author: " + rs.getString("author")
                    + ", Price: Rs." + rs.getDouble("price")
                );
            }

            rs.close();
            st.close();
            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(
                "Database Error: " + e.getMessage()
            );
        }

        sc.close();
    }
}