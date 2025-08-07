package Scenario_Ques;

import java.util.Scanner;

public class Valley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Number of Strings : ");
		int n = s.nextInt();
		s.nextLine();
		
		System.out.print("Enter a string : ");
		String str = s.nextLine();
		
		int sealevel = 0;
		int currentlevel = 0;
		int valley = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == 'U'|| ch == 'u') {
				currentlevel++;
				if(currentlevel == sealevel) {
					valley++;
				}
			}else if (ch == 'D'|| ch == 'd'){
				currentlevel--;
			}
		}
		
		System.out.println(valley);
	}

}
