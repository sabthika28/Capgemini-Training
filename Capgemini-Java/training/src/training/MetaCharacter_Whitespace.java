package training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCharacter_Whitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "Hi there,\tHow are you?\nGood day!";

	        // \s - matches whitespace
	        Pattern patternSpace = Pattern.compile("\\s");
	        Matcher matcher1 = patternSpace.matcher(text);
	        System.out.println("Matches for \\s (whitespace):");
	        while (matcher1.find()) {
	            System.out.println("Found: '" + matcher1.group() + "' at index " + matcher1.start());
	        }

	        // \S - matches non-whitespace
	        Pattern patternNonSpace = Pattern.compile("\\S");
	        Matcher matcher2 = patternNonSpace.matcher(text);
	        System.out.println("\nMatches for \\S (non-whitespace):");
	        while (matcher2.find()) {
	            System.out.println("Found: '" + matcher2.group() + "' at index " + matcher2.start());
	        }

	}

}
