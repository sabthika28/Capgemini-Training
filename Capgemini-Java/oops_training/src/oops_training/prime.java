package oops_training;

import java.util.Scanner;

public class prime {
	static boolean isPrime(int n){
		if (n <= 1)
			return false;
	    for (int i = 2; i <= Math.sqrt(n); i++)
	        if (n % i == 0)
	            return false;

	    return true;
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if (isPrime(num)) {
			System.out.println(num + " is prime");
	    }
	    else {
	        System.out.println(num + " is not prime");
	    }
	}
}
