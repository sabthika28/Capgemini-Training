package JDBC;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Person {
    String name;
    int age;
    double salary;

    Person(String n, int a, double s) {
        name = n;
        age = a;
        salary = s;
    }

    public String toString() {
        return name + ":" + age + ":" + salary;
    }
}

public class Custom_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine();																																																								

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 

            people.add(new Person(name, age, salary));
        }

        people.sort(
            Comparator.comparingInt((Person p) -> p.age)
                      .thenComparing(Comparator.comparingDouble((Person p) -> p.salary).reversed())
                      .thenComparing(p -> p.name)
        );

        System.out.println("\nSorted Persons:");
        people.forEach(System.out::println);

	}

}
