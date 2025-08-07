package training;

import java.util.regex.Pattern;

public class Pattern_RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[xyz]", "chennai"));
		System.out.println(Pattern.matches("[xyz]", "x"));
		System.out.println(Pattern.matches("[xyz]", "xxyyyz"));
		
		
	}

}
