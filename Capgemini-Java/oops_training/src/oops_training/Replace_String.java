package oops_training;

public class Replace_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World Java";

        // Replace spaces with %20
        String encodedStr = str.replace(" ", "%20");

        System.out.println("Original: " + str);
        System.out.println("URL Encoded: " + encodedStr);

	}

}
