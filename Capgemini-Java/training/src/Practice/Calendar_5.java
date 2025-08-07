package Practice;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Calendar_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZonedDateTime time = ZonedDateTime.now(ZoneId.of("America/New_York"));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss z");
		
		System.out.println("Current time of New York is : "+ time.format(formatter));
		
		
		
		

	}

}
