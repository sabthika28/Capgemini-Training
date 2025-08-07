package test;

import java.util.Scanner;

public class FactorOfNumber_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Read input number
	        int num = sc.nextInt();

	        // Handle the special case for 0
	        if (num == 0) {
	            System.out.println("No Factors");
	        } else {
	            // Convert negative to positive
	            num = Math.abs(num);

	            // Print factors
	            for (int i = 1; i <= num; i++) {
	                if (num % i == 0) {
	                    if (i == num) {
	                        System.out.print(i); // Don't put comma after the last one
	                    } else {
	                        System.out.print(i + ", ");
	                    }
	                }
	            }
	        }

	}

}
