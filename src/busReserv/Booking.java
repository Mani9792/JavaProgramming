package busReserv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	
	String passengerName;
	int busNo;
	Date date;
	
	Booking()
	{
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter the name of passenger: ");
		
		passengerName = scanner.next();
		
		System.out.println("Enter Bus No: ");
		
		busNo = scanner.nextInt();
		 
		System.out.println("Enter the travel date: ");
		
		String dateInput = scanner.next();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
		try 
		{
			date = sdf.parse(dateInput);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus>buses )
	{
		int capacity = 0;
		
	    //To get the bus capacity and info

		for(Bus bus : buses)
		{
			if(bus.getBusNo() == busNo) //bus no is compared it automatically marks Booking class as it was referenced object 
			{
				capacity = bus.getCapacity();
			}
		}
		
		int countBooked = 0; //to count the bookings
		for(Booking booking: bookings)
		{
			if(booking.busNo == busNo && booking.date.equals(date)) 
				//To check the Stored bookings date,busno in booking object with Current booking date and bus no
			{
				countBooked++;
			}
		}
		
		return countBooked < capacity ?true:false;
		
	}

}
