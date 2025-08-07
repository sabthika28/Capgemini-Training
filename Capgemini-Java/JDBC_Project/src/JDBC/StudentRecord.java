package JDBC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentRecord {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
        String fileName = "students.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("SlNo Name Email Course Marks\n");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details for student " + i + ":");

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Email: ");
                String email = scanner.nextLine();

                System.out.print("Course: ");
                String course = scanner.nextLine();

                System.out.print("Marks: ");
                int marks = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover newline

                writer.write(i + " " + name + " " + email + " " + course + " " + marks + "\n");
            }

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("\nStudents with marks > 250:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length == 5) {
                    int marks = Integer.parseInt(parts[4]);
                    if (marks > 250) {
                        System.out.println(line);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        scanner.close();
		

	}

}
