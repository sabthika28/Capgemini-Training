package JDBC;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Transaction {
    String id, type;
    double amount;

    Transaction(String id, String type, double amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return id + ":" + type + ":" + amount;
    }
}

public class Group_Aggregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        List<Transaction> transactions = new ArrayList<>();

        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for transaction " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Type: ");
            String type = sc.nextLine();
            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            transactions.add(new Transaction(id, type, amount));
        }

 
        Map<String, Double> totalByType = transactions.stream()
            .collect(Collectors.groupingBy(
                t -> t.type,
                Collectors.summingDouble(t -> t.amount)
            ));

        System.out.println("\nTotal amount by type:");
        totalByType.forEach((type, total) ->
            System.out.println(type + " -> " + total)
        );
	}

}
