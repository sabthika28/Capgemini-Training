package test;

import java.util.Scanner;

public class MathEquation_4 {
	 static int solveEquation(int a, int b) {
	        int result = (a * a * a)         // a³
	                   + 3 * a * a * b       // 3a²b
	                   + 3 * a * b * b       // 3ab²
	                   + (b * b * b);        // b³

	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input: a, b, c
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        int result = solveEquation(a, b);
        System.out.println("Result of the equation is: " + result);

	}

}
