package oops_training;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int units = s.nextInt();
		double amount = 0;
		if (units <= 100) {
            amount = units * 1.5;
        } else if (units <= 200) {
            amount = units * 2.0;
        } else if (units <= 300) {
            amount = units * 3.0;
        } else {
            amount = units * 5.0;
        }

        System.out.println("Electricity Bill = ₹ " + amount);
      
	}

}
