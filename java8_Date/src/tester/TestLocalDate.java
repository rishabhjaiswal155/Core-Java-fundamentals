package tester;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class TestLocalDate {

	public static void main(String[] args) {
		LocalDate d1=LocalDate.now();
		System.out.println("Date:"+d1);
		LocalTime t1=LocalTime.now();
		System.out.println("Time:"+t1);
		LocalDateTime timestamp=LocalDateTime.now();
		System.out.println("TimeStamp:"+timestamp);
		LocalDate d2=LocalDate.of(2024,8,15);
		System.out.println("Date: "+d2);
		System.out.println(d1.isAfter(d2));
		System.out.println(d1.isBefore(d2));
		System.out.println(d1.isEqual(d2));
		System.out.println(LocalDate.parse("1996-04-22"));
		System.out.println("Rishabh's Age is:"+Period.between(LocalDate.parse("1996-04-22"),LocalDate.now()).getYears()+" yrs");
		
		
	}

}
