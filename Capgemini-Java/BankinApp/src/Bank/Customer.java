package Bank;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Customer {
    private Connection connection;
    private Scanner scanner;

    public Customer(Connection connection, Scanner scanner) {
        this.connection = connection;
        this.scanner = scanner;
    }

    public void registerCustomer() {
        scanner.nextLine(); // clear input buffer

        System.out.print("Customer Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.print("Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dob);

        LocalDateTime createdAt = LocalDateTime.now();

        String query = "INSERT INTO Customer(name, phone, address, email, password, dob, created_at) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, address);
            ps.setString(4, email);
            ps.setString(5, password);
            ps.setDate(6, Date.valueOf(dateOfBirth));
            ps.setTimestamp(7, Timestamp.valueOf(createdAt));

            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("✅ Customer profile created successfully!");
            } else {
                System.out.println("❌ Failed to create customer profile.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean loginCustomer(String email, String password) {
        String query = "SELECT * FROM Customer WHERE email = ? AND password = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next(); // true if login success
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean customer_exist(String email) {
        String query = "SELECT * FROM Customer WHERE email = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            return rs.next(); // true if customer exists
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}


