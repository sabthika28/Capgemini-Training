package JDBC;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int birthYear;
    double salary;

    Employee(String n, int y, double s) {
        name = n;
        birthYear = y;
        salary = s;
    }
}

public class StreamFiltering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Birth Year: ");
            int birthYear = Integer.parseInt(sc.nextLine());
            System.out.print("Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            employees.add(new Employee(name, birthYear, salary));
        }

        // Filter and transform using streams
        List<String> result = employees.stream()
            .filter(e -> e.salary > 50000 && e.birthYear > 1990)
            .map(e -> e.name.toUpperCase())
            .collect(Collectors.toList());

        // Output result
        System.out.println("\nQualified Employee Names (UPPERCASE):");
        if (result.isEmpty()) {
            System.out.println("No employees matched the criteria.");
        } else {
            result.forEach(System.out::println);
        }

	}

}
