package Practice;

import java.util.Calendar;

public class Calendar_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		int maxYear = cal.getActualMaximum(Calendar.YEAR);
		int maxMonth = cal.getActualMaximum(Calendar.MONTH) + 1;
		int maxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int maxDate = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int maxHour = cal.getActualMaximum(Calendar.HOUR_OF_DAY) + 1;
		
		   System.out.println("Maximum Values from Calendar:");
	        System.out.println("Max Year  : " + maxYear);    
	        System.out.println("Max Month : " + maxMonth);    
	        System.out.println("Max Week  : " + maxWeek);
	        System.out.println("Max Date  : " + maxDate);
	        System.out.println("Max Hour  : " + maxHour);
	        
	        System.out.println();
	        
	        int minYear = cal.getActualMinimum(Calendar.YEAR);
			int minMonth = cal.getActualMinimum(Calendar.MONTH) + 1;
			int minWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
			int minDate = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
			int minHour = cal.getActualMinimum(Calendar.HOUR_OF_DAY) + 1;
			
			   System.out.println("Minimum Values from Calendar:");
		        System.out.println("Min Year  : " + minYear);    
		        System.out.println("Min Month : " + minMonth);    
		        System.out.println("Min Week  : " + minWeek);
		        System.out.println("Min Date  : " + minDate);
		        System.out.println("Min Hour  : " + minHour);
	        
	        
		
	}

}
