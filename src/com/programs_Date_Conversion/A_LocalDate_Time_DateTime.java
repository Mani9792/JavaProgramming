package com.programs_Date_Conversion;

import java.time.LocalDate;

public class A_LocalDate_Time_DateTime {

	public static void main(String[] args) {
		// Local Date
		//Java LocalDate class is an immutable class that represents Date with a default format of yyyy-mm-dd. 
		//It inherits Object class and implements the ChronoLocalDate interface
		
		LocalDate today = LocalDate.now();
		LocalDate yesterday = today.minusDays(1);
		LocalDate tomorrow = today.plusDays(1);
		
		System.out.println("Today: "+today+" Tommorrow: "+tomorrow+" Yesterday: "+yesterday);
		
		//to demonstrate leap year isLeapYear
		System.out.println("Verify Leap year");
		System.out.println(today.isLeapYear());
		
		LocalDate date1 = LocalDate.of(2022, 12, 12);
		LocalDate date2 = LocalDate.of(2016, 9, 12);
		
		System.out.println(date1.isLeapYear());
		
		System.out.println(date2.isLeapYear());
		
		

	}

}
