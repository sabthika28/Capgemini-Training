package test;

import java.util.Scanner;

public class Dealership_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("\nTotal Dealerships : " + n +"\n" );
		for(int i = 1; i <= n; i++) {
			int car = s.nextInt();
			int bike = s.nextInt();
			System.out.println("Dealership "+i+ " contains " +car+ " cars and " +bike+ " bikes" );
			int Tyres = (car * 4) + (bike * 2);
			System.out.print("Total number of tyres for dealership " +i+ ": "+Tyres+ "\n");	
		}
	}

}
