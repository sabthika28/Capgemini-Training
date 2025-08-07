package Practice;

import java.util.Calendar;

public class Calendar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY); // HOUR_OF_DAY = 24 hrs format , HOUR = 12 hrs 
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int ampm = cal.get(Calendar.AM_PM); 
		
		System.out.println("CURRENT DATA & TIME : ");
		System.out.println("YEAR : " + year); 
		System.out.println("MONTH : " + month);
		System.out.println("DAY : " + day);
		System.out.println("HOUR : " + hour);
		System.out.println("MINUTE : " + minute);
		System.out.println("SECOND : " + second);
		System.out.println("AM/PM : " + (ampm == Calendar.AM ? "AM" : "PM"));
		
		
	}

}
