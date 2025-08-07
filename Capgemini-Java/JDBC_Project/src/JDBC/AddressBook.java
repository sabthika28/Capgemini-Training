package JDBC;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

class Contact {
    String name, phone, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    String toCSV() {
        return String.join(",", name, phone, email);
    }

    static Contact fromCSV(String line) {
        String[] parts = line.split(",", -1);
        return new Contact(parts[0], parts[1], parts[2]);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class AddressBook {
    private static final String FILE = "contacts.csv";
    private static List<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadContacts();

        while (true) {
            System.out.println("\nADDRESS BOOK MENU");
            System.out.println("1. Add Contact\n2. Update Contact\n3. Delete Contact\n4. Search Contact\n5. List All\n6. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> updateContact();
                case 3 -> deleteContact();
                case 4 -> searchContact();
                case 5 -> listContacts();
                case 6 -> {
                    saveContacts();
                    System.out.println("Saved. Exiting...");
                    return;
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        String phone = getValidPhone();

        String email = getValidEmail();

        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact Added.");
    }

    private static void updateContact() {
        System.out.print("Enter Name to Update: ");
        String name = scanner.nextLine();

        Optional<Contact> match = contacts.stream()
                .filter(c -> c.name.equalsIgnoreCase(name))
                .findFirst();

        if (match.isPresent()) {
            Contact c = match.get();

            c.phone = getValidPhone();
            c.email = getValidEmail();

            System.out.println("Contact Updated.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    private static void deleteContact() {
        System.out.print("Enter Name to Delete: ");
        String name = scanner.nextLine();

        boolean removed = contacts.removeIf(c -> c.name.equalsIgnoreCase(name));
        System.out.println(removed ? "Deleted." : "Not Found.");
    }

    private static void searchContact() {
        System.out.print("Search by Name or Phone: ");
        String keyword = scanner.nextLine().toLowerCase();

        List<Contact> results = contacts.stream()
                .filter(c -> c.name.toLowerCase().contains(keyword) || c.phone.contains(keyword))
                .collect(Collectors.toList());

        if (results.isEmpty()) {
            System.out.println("No Matches Found.");
        } else {
            results.forEach(System.out::println);
        }
    }

    private static void listContacts() {
        System.out.println("\nAll Contacts:");
        contacts.forEach(System.out::println);
    }

    private static void loadContacts() {
        try {
            Path path = Paths.get(FILE);
            if (Files.exists(path)) {
                contacts = Files.lines(path)
                        .map(Contact::fromCSV)
                        .collect(Collectors.toList());
            }
        } catch (IOException e) {
            System.out.println("Error loading contacts: " + e.getMessage());
        }
    }

    private static void saveContacts() {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE))) {
            for (Contact c : contacts) {
                writer.write(c.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }

    private static String getValidPhone() {
        String phone;
        while (true) {
            System.out.print("Enter Phone: ");
            phone = scanner.nextLine();
            if (phone.matches("\\d{10}")) break;
            System.out.println("Invalid phone number. Please enter exactly 10 digits.");
        }
        return phone;
    }

    private static String getValidEmail() {
        String email;
        while (true) {
            System.out.print("Enter Email: ");
            email = scanner.nextLine();
            if (email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) break;
            System.out.println("Invalid email format. Try again.");
        }
        return email;
    }
}
