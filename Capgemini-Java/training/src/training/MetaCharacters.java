package training;

import java.util.regex.Pattern;

public class MetaCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Meta Characters d ..."); // d means digit
		System.out.println(Pattern.matches("\\d", "abc")); // false (non-digit)
		System.out.println(Pattern.matches("\\d", "1")); // true (digit comes once)
		System.out.println(Pattern.matches("\\d", "4445")); // false (digit but comes more than once)
		System.out.println(Pattern.matches("\\d", "323abc")); // false (digit and char)
		System.out.println("Meta Characters D ..."); // D means non-digit
		System.out.println(Pattern.matches("\\D", "abc")); // false (non-digit but comes more than once)
		System.out.println(Pattern.matches("\\D", "1")); // false (digit)
		System.out.println(Pattern.matches("\\D", "4443")); // false (digit)
		System.out.println(Pattern.matches("\\D", "323abc")); // false (digit and char)
		System.out.println(Pattern.matches("\\D", "m")); // true (non-digit comes once)
		System.out.println("Meta Characters D with Quantifiers ...");
		System.out.println(Pattern.matches("\\D*", "abc")); // true (non-digit and may come 0 or more times)
		System.out.println(Pattern.matches("\\D?", "abc"));
		System.out.println(Pattern.matches("\\D+", "abc"));

	}

}
