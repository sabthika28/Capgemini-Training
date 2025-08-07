package Bank;

import java.sql.*;
import java.util.Scanner;

public class Admin {
    private Connection connection;
    private Scanner scanner;

    public Admin(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public void registerAdmin() {
        try {
            scanner.nextLine(); // consume newline
            System.out.print("Enter Admin Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Admin Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Admin Password: ");
            String password = scanner.nextLine();

            String insertQuery = "INSERT INTO admin (name, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(insertQuery);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Admin Registered Successfully!");
            } else {
                System.out.println("Admin Registration Failed!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean loginAdmin(String email, String password) {
        try {
            String query = "SELECT * FROM admin WHERE email = ? AND password = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            return rs.next(); // true if credentials match

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void viewAllCustomers() {
        try {
            String query = "SELECT * FROM customer";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("\n--- All Customers ---");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Phone: " + rs.getString("phone"));
                System.out.println("-----------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewCustomerByEmail() {
        try {
            System.out.print("Enter Customer Email: ");
            String email = scanner.nextLine();

            String query = "SELECT * FROM customer WHERE email = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Phone: " + rs.getString("phone"));
            } else {
                System.out.println("No customer found with the given email.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
