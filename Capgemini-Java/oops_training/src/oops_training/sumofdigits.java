package oops_training;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		while (n != 0) {
            int digit = n % 10; 
            sum += digit;            
            n /= 10;  
		}
		System.out.print(sum);
	}
}
