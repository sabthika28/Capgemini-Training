package oops_training;

import java.util.Scanner;

public class array_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	        	arr[i] = sc.nextInt();
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        
	        int max = arr[0];
	        int min = arr[0];
	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max) max = arr[i];
	            if (arr[i] < min) min = arr[i];
	        }
	        System.out.println("Maximum number: " + max);
	        System.out.println("Minimum number: " + min);
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += arr[i];
	        }
	        double average = (double) sum / n;
	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + average);

	        System.out.print("Enter key to search: ");
	        int key = sc.nextInt();
	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == key) {
	                System.out.println(key + " found at position " + i);
	                found = true;
	                break;
	            }
	        }
	        if(!found) {
	        	System.out.println(key + " not found");
	        }
	        System.out.println("Reverse order");
	        for (int i = n - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }


	}

}
