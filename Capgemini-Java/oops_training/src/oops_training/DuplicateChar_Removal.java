package oops_training;

public class DuplicateChar_Removal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("Original string: " + str);
        System.out.println("Without duplicates: " + result);
    }

}
