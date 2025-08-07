package training;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class EmailValidator {
	// Method to check if the email is valid
    public static boolean isValid(String email) {
        // Regular expression to match valid email formats
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern p = Pattern.compile(emailRegex);     
        // Check if email matches the pattern
        return email != null && p.matcher(email).matches();
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> e = new ArrayList<>();
        e.add("review-team@sixphrase.com");
        e.add("writing.capgemini.org");    
        for (String email : e) {
            System.out.println(email + ": " + (isValid(email) ? "Yes" : "No"));
        }

	}

}
