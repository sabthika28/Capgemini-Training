package oops_training;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int reverse = 0;
		while(n != 0) {
			int digit = n%10;
			reverse = reverse * 10 + digit;
			n /= 10;
		}
		System.out.println(reverse);

	}

}
