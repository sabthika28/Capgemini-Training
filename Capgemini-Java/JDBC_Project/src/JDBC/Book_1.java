package JDBC;

import java.util.Scanner;

public class Book_1 {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Project_1 handler = new Project_1();

 
        System.out.print("Enter name to insert: ");
        handler.setName(scanner.nextLine());
        System.out.print("Enter age to insert: ");
        handler.setAge(scanner.nextInt());
        scanner.nextLine();
        handler.insertStudent();

        handler.retrieveStudents();

        System.out.print("\nEnter student ID to update: ");
        handler.setId(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Enter new name: ");
        handler.setName(scanner.nextLine());
        System.out.print("Enter new age: ");
        handler.setAge(scanner.nextInt());
        scanner.nextLine(); 
        handler.updateStudent();

        handler.retrieveStudents();

        System.out.print("\nEnter student ID to delete: ");
        handler.setId(scanner.nextInt());
        scanner.nextLine(); 
        handler.deleteStudent();

        
        handler.retrieveStudents();
        scanner.close();
    }
}



