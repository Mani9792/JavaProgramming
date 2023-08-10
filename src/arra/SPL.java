package arra;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="ABC!!@##!";
		
		System.out.println(s.replaceAll("[^a-zAA-Z0-9]", ""));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH_mm_ss");  
		LocalDateTime dateTime = LocalDateTime.now();
		String timeNow = formatter.format(dateTime);
		
		System.out.println("Time is: "+timeNow );

	}

}
