package training;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class PhNum_Validator {
	 public static boolean isValid(String number) {
	        // Regex: optional +91 or 91, optional spaces/dashes, and 10 digits starting with 7/8/9
	        String phoneRegex = "^(\\+91|91)?[\\s-]*[789]\\d{2}[\\s-]*\\d{3}[\\s-]*\\d{4}$";
	        Pattern p = Pattern.compile(phoneRegex);
	        return number != null && p.matcher(number).matches();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> numbers = new ArrayList<>();
	        numbers.add("9876543210");          
	        numbers.add("+91 98765 43210");     
	        numbers.add("91-98765-43210");      
	        numbers.add("1234567890");          
	        numbers.add("+91-9876-543-210");    
	        numbers.add("+919876543210");       
	        numbers.add("98765@43210");         

	        for (String num : numbers) {
	            System.out.println(num + ": " + (isValid(num) ? "Valid" : "Invalid"));
	        }

	}

}
