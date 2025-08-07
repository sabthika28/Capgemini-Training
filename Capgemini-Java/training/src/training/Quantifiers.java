package training;

import java.util.regex.Pattern;

public class Quantifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("? Quantifiers ...");
		System.out.println(Pattern.matches("[ayz]?", "a")); // true (a or y or z comes one time)
		System.out.println(Pattern.matches("[ayz]?", "aaa")); // false (a comes more than one time)
		System.out.println(Pattern.matches("[ayz]?", "ayyyzz")); //false (a, y and z comes more than one time)
		System.out.println(Pattern.matches("[ayz]?", "santa")); // false (a comes more than one time)
		System.out.println(Pattern.matches("[ayz]?", "ay")); // false (a or y or z must come one time)
		System.out.println("+ Quantifiers ...");
		System.out.println(Pattern.matches("[ayz]+", "a")); // true (a or y or z once or more times)
		System.out.println(Pattern.matches("[ayz]+", "aaa")); // true (a comes more than one time)
		System.out.println(Pattern.matches("[ayz]+", "aayyyzz")); // true (a or y or z comes more than once)
		System.out.println(Pattern.matches("[ayz]+", "aammta")); // false (z and t are not matching pattern)
		System.out.println("* Quantifiers ...");
		System.out.println(Pattern.matches("[ayz]*", "ayyyza"));

	}

}
