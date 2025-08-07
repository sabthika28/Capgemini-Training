package test;

import java.util.Scanner;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int len = str.length();
		
		char repeatChar = ' ';
		boolean found = false;
		
		for(int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			
			for(int j = i+1; j<len; j++) {
				if(ch == str.charAt(j)) {
					repeatChar = ch;
					found = true;
				}
			}
		if(found) {
			break;
		}
	}
		if (found) {
			System.out.print("First repeating character : "+repeatChar);
		}
		else {
			System.out.print("No repeating character");
		}
		

	}

}
