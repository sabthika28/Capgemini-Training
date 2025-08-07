package training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCharacter_Boundary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "The cat sat on the catalog and concatenated words.";

	        // \bcat\b matches "cat" as a whole word
	        Pattern patternWordBoundary = Pattern.compile("\\bcat\\b");
	        Matcher matcher1 = patternWordBoundary.matcher(text);
	        System.out.println("Matches for \\bcat\\b:");
	        while (matcher1.find()) {
	            System.out.println("Found: " + matcher1.group() + " at index " + matcher1.start());
	        }
	        System.out.println(Pattern.matches("\\bcat\\b", "cat"));

	        // \Bcat\B matches "cat" that is not at the start or end of a word
	        Pattern patternNonWordBoundary = Pattern.compile("\\Bcat\\B");
	        Matcher matcher2 = patternNonWordBoundary.matcher(text);
	        System.out.println("\nMatches for \\Bcat\\B:");
	        while (matcher2.find()) {
	            System.out.println("Found: " + matcher2.group() + " at index " + matcher2.start());
	        }
	        System.out.println(Pattern.matches("\\Bcat\\B", "concatenated"));
	        Pattern p = Pattern.compile("\\Bcat\\B");
	        Matcher m = p.matcher("concatenated");
	        if(m.find()) {
	        	System.out.println("Match found");
	        }
	        else {
	        	System.out.println("Match not found");
	        }

	}

}
