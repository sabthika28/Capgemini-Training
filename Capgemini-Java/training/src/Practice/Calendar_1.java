package Practice;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Calendar_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, 2025);
		cal.set(Calendar.MONTH, Calendar.JULY);
		cal.set(Calendar.DAY_OF_MONTH, 11);
		
		Date d = cal.getTime();
		
		System.out.print("Date : " +d);
		
		System.out.println();
		
		LocalDate ld = LocalDate.now();
		System.out.print("Current Date : " +ld);

	}

}
