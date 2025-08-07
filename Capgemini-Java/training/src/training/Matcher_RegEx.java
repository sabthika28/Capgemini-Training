package training;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner = new Scanner(System.in)){
			while(true) {
				System.out.println("Enter regex pattern");
				String regexPattern = scanner.nextLine();
				Pattern pattern =Pattern.compile(regexPattern);
				Matcher matcher = pattern.matcher("Welcome to Capgemini");
				boolean found = false;
				while(matcher.find()) {
					System.out.println("Found the text" + matcher.group() 
					+ " starting at index " + matcher.start() 
					+ " and ending index "+ matcher.end());
					found = true;
				}
				if(!found)
					System.out.println("Match not found.");
			}
		}

	}

}
