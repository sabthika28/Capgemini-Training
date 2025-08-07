package oops_training;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int reverse = 0;
		int original = n;
		while(n != 0) {
			int digit = n%10;
			reverse = reverse * 10 + digit;
			n /= 10;
		}
		if(reverse == original) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
