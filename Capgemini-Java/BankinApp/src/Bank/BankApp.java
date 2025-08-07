package Bank;

import java.sql.*;
import java.util.Scanner;

public class BankApp {
    private static final String url = "jdbc:mysql://localhost:3306/BankingApp_db";
    private static final String username = "root";
    private static final String password = "Sabthika@28";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner scanner = new Scanner(System.in);

            User user = new User(connection, scanner);
            Customer customer = new Customer(connection, scanner);
            Accounts accounts = new Accounts(connection, scanner);
            AccountManager accountManager = new AccountManager(connection, scanner);
            Admin admin = new Admin(connection, scanner);

            while (true) {
                System.out.println("\n*** WELCOME TO BANKING SYSTEM ***");
                System.out.println("1. Register as Customer");
                System.out.println("2. Register as User");
                System.out.println("3. Register as Admin");
                System.out.println("4. Login");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        customer.registerCustomer();
                        break;

                    case 2:
                        user.register();
                        break;

                    case 3:
                        admin.registerAdmin();
                        break;

                    case 4:
                        System.out.println("\nLogin as:");
                        System.out.println("1. Customer");
                        System.out.println("2. User");
                        System.out.println("3. Admin");
                        System.out.print("Enter your choice: ");
                        int loginChoice = scanner.nextInt();

                        scanner.nextLine(); // consume newline
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter Password: ");
                        String loginPassword = scanner.nextLine();

                        if (loginChoice == 1) {
                            if (customer.loginCustomer(email, loginPassword)) {
                                System.out.println("\nCustomer Logged In!");

                                long accountNumber;
                                if (!accounts.account_exist(email)) {
                                    System.out.println("1. Open a new Bank Account");
                                    System.out.println("2. Go to Home");
                                    System.out.print("Enter your choice: ");
                                    int ch = scanner.nextInt();
                                    if (ch == 1) {
                                        accountNumber = accounts.open_account(email);
                                        System.out.println("Account Created Successfully");
                                        System.out.println("Your Account Number is: " + accountNumber);
                                    } else {
                                        break;
                                    }
                                }

                                accountNumber = accounts.getAccount_number(email);
                                int op;
                                do {
                                    System.out.println("\n--- Customer Menu ---");
                                    System.out.println("1. Debit Money");
                                    System.out.println("2. Credit Money");
                                    System.out.println("3. Transfer Money");
                                    System.out.println("4. Check Balance");
                                    System.out.println("5. Go Home");
                                    System.out.print("Enter your choice: ");
                                    op = scanner.nextInt();

                                    switch (op) {
                                        case 1:
                                            accountManager.debit_money(accountNumber);
                                            break;
                                        case 2:
                                            accountManager.credit_money(accountNumber);
                                            break;
                                        case 3:
                                            accountManager.transfer_money(accountNumber);
                                            break;
                                        case 4:
                                            accountManager.getBalance(accountNumber);
                                            break;
                                        case 5:
                                            System.out.println("Customer Logged Out.");
                                            break;
                                        default:
                                            System.out.println("Invalid Option.");
                                    }
                                } while (op != 5);

                            } else {
                                System.out.println("Invalid Customer Credentials.");
                            }

                        } else if (loginChoice == 2) {
                            if (user.loginUser(email, loginPassword)) {
                                System.out.println("\nUser Logged In!");
                                int op;
                                do {
                                    System.out.println("\n--- User Menu ---");
                                    System.out.println("1. View Account Details by Account Number");
                                    System.out.println("2. Go Home");
                                    System.out.print("Enter your choice: ");
                                    op = scanner.nextInt();

                                    switch (op) {
                                        case 1:
                                            System.out.print("Enter Account Number to View Details: ");
                                            long accNo = scanner.nextLong();
                                            accountManager.getBalance(accNo);
                                            break;
                                        case 2:
                                            System.out.println("User Logged Out.");
                                            break;
                                        default:
                                            System.out.println("Invalid Option.");
                                    }
                                } while (op != 2);
                            } else {
                                System.out.println("Invalid User Credentials.");
                            }

                        } else if (loginChoice == 3) {
                            if (admin.loginAdmin(email, loginPassword)) {
                                System.out.println("\nAdmin Logged In!");
                                int adminChoice;
                                do {
                                    System.out.println("\n--- Admin Menu ---");
                                    System.out.println("1. View All Customers");
                                    System.out.println("2. View Customer by Email");
                                    System.out.println("3. Go Home");
                                    System.out.print("Enter your choice: ");
                                    adminChoice = scanner.nextInt();
                                    scanner.nextLine();

                                    switch (adminChoice) {
                                        case 1:
                                            admin.viewAllCustomers();
                                            break;
                                        case 2:
                                            admin.viewCustomerByEmail();
                                            break;
                                        case 3:
                                            System.out.println("Admin Logged Out.");
                                            break;
                                        default:
                                            System.out.println("Invalid Option.");
                                    }
                                } while (adminChoice != 3);
                            } else {
                                System.out.println("Invalid Admin Credentials.");
                            }
                        } else {
                            System.out.println("Invalid Login Option.");
                        }
                        break;

                    case 5:
                        System.out.println("THANK YOU FOR USING BANKING SYSTEM!");
                        return;

                    default:
                        System.out.println("Invalid Main Menu Choice!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
