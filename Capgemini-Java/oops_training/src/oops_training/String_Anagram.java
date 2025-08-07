package oops_training;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
        String str2 = "silent";

        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            System.out.println("The strings are NOT anagrams.");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

	}

}
