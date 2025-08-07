package test;

import java.util.Scanner;

public class n_RepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int len = str.length();
		int n = s.nextInt();
		
		char repeatChar = ' ';
		boolean found = false;
		String checked = " ";
		int count = 0;
		
		for(int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			
			if(checked.indexOf(ch) != -1) {
				continue;
			}
			
			for(int j = i+1; j<len; j++) {
				if(ch == str.charAt(j)) {
					count ++;
					checked += ch;
					if(n == count) { 
						repeatChar = ch;
						found = true;
					}
					break;
				}
			}
		if(found) {
			break;
		}
	}
		if (found) {
			System.out.print("N-th repeating character : "+repeatChar);
		}
		else {
			System.out.print("No repeating character");
		}

	}

}
