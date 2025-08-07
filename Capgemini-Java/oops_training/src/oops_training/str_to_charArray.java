package oops_training;

public class str_to_charArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "hello";
	     char[] charArray = str.toCharArray();

	     System.out.println("Character Array:");
	     for (char c : charArray) {
	    	 System.out.print(c + " ");
	     }

	     String newStr = new String(charArray);
	     System.out.println("\nConverted back to String: " + newStr);
	}

}
