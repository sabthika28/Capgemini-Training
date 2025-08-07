package oops_training;

public class NonRepeating_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found.");
        }

	}

}
