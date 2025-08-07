package training;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt=new Date();
		System.out.println(dt);
		
		LocalDate ld=LocalDate.now();
		System.out.println("current date is : "+ld);
		
		LocalDate l1=LocalDate.of(2015, 02, 20);
		l1=l1.minus(5,ChronoUnit.MONTHS);
		System.out.println(l1);

		
		LocalDate l2=LocalDate.parse("2015-02-20");
		l2=l2.plusDays(4);
		System.out.println(l2);
		
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println(tomorrow);
		
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println(previousMonthSameDay);
		
		DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
		System.out.println(sunday);	

		int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
		System.out.println(twelve);	
		
		boolean leapYear = LocalDate.now().isLeapYear();
		System.out.println(leapYear);
		
		boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
		System.out.println(notBefore);

		boolean isAfter = LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
		System.out.println(isAfter);
		
		LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
		System.out.println(beginningOfDay);
		
		LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(firstDayOfMonth);
		
		LocalTime now = LocalTime.now();
		System.out.println(now);

		
	}

}
