package Bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
    private Connection connection;
    private Scanner scanner;

    public User(Connection connection, Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }

    // Register a new user
    public void register(){
        scanner.nextLine();
        System.out.print("Full Name: ");
        String full_name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if(user_exist(email)) {
            System.out.println("User already exists with this email!");
            return;
        }

        String registerQuery = "INSERT INTO User(full_name, email, password) VALUES (?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(registerQuery)) {
            ps.setString(1, full_name);
            ps.setString(2, email);
            ps.setString(3, password);
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Registration successful!");
            } else {
                System.out.println("Registration failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Login by reading input from user
    public String login() {
        scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (loginUser(email, password)) {
            System.out.println("User login successful!");
            return email;
        } else {
            System.out.println("Invalid credentials.");
            return null;
        }
    }

    public boolean loginUser(String email, String password) {
        String query = "SELECT * FROM User WHERE email = ? AND password = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean user_exist(String email) {
        String query = "SELECT * FROM User WHERE email = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            return rs.next(); // returns true if found
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
