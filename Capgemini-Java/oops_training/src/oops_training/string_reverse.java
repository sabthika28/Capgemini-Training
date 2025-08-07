package oops_training;

public class string_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = " hello world";
        String reversedString = "";
        
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }
        
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);

	}

}
