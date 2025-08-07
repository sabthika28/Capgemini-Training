package Scenario_Ques;

import java.util.Scanner;


public class AirportLuggage {
	public static int TotalFare(int[]weights, int t) {
		int totalfare = 0;
		for(int weight : weights) {
			if(weight > t) {
				totalfare += 2;
			}else {
				totalfare += 1;
			}
		}
		return totalfare;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of luggages : ");
		int n = s.nextInt();
		System.out.print("Weight of each luggage : ");
		int[] weights = new int[n];
		for(int i = 0; i < n; i++) {
			weights[i] = s.nextInt();
		}
		System.out.print("Threshold : ");
		int T = s.nextInt();
		int result = TotalFare(weights, T);
		System.out.print(result);
		
	}

}
