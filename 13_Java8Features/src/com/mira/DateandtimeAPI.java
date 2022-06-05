package com.mira;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class DateandtimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate l=LocalDate.now();//gives the current date
		
		//yesterday's date
		
		LocalDate l1=l.minusDays(1);
		
		//Tomorrow's Date
		
		LocalDate l2=l.plusDays(1);
		
		System.out.println("tomorrow's date:"+l2);
		
		LocalDateTime lt=LocalDateTime.now();
		//System.out.println("Current Date and time:"+lt);
		
		ZonedDateTime z=ZonedDateTime.now();
		//System.out.println("Zone information with current date and time:"+z);
		
		//period class
		Period p=Period.ofDays(31);
		
		Temporal temp=p.addTo(LocalDate.now());
		
		//System.out.println(temp);
		
		//instant class
		
		Instant i=Instant.now();
		//System.out.println(i);
		
		//duration class
		
		Duration d=Duration.between(LocalTime.NOON,LocalTime.MIDNIGHT);
		//System.out.println(d);
		
		//Date Time foramtter
		LocalDate date = LocalDate.now();

		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy MM dd");


		// converting date to String
		String text = date.format(formatter);
		
		System.out.println("Date in user pattern:"+text);


		// converting String to dates
		LocalDate parsedDate = LocalDate.parse(text, formatter);
		System.out.println("date in by default pattern:"+parsedDate);


	}

}
