package Scenario_Ques;

import java.util.Scanner;

public class PythagoreanTriplets {
	public static void generateTriplets(int limit) {
		int m = 2;
		while(true) {
			for(int n = 1; n < m; n++) {
				int a = m*m - n*n;
				int b = 2*m*n;
				int c = m*m + n*n;
				
				if(c>limit)
					break;
				if(a<=limit && b<=limit && c<=limit) {
					System.out.println(a + " "+ b + " " + c);
				}
			}
			m++;
			if(m*m > limit)
				break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		int limit = s.nextInt();
		System.out.println("Pythagorean Triplets : ");
		generateTriplets(limit);

	}

}
