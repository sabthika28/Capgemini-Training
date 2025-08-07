package oops_training;

public class string_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "Welcome to Java Class";
        int length = 0;

        char[] charArray = myString.toCharArray();

        for (char c : charArray) {
            length++;
        }

        System.out.println("String Length : " + length);

	}

}
