package busReserv;

import java.util.ArrayList;
import java.util.Scanner;

public class BusReservDemo {

	public static void main(String[] args) {
		
		//Creating bus objects using Array List
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		
		//To store the booking details
		
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		//To display bus Info
		
		for(Bus b : buses)
		{
			b.displayBusInfo();
		}
		
		int userOpt = 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(userOpt == 1)
		{
		System.out.println("Enter 1 to book and 2 to exit");
		
		userOpt = sc.nextInt(); 
		
		if(userOpt == 1)
		{
			//Codes to get the details from Passenger and book
			
			Booking booking = new Booking(); //Creating a constructor in Booking class to Initialise and get the values from passenger
			
			//To check the Booking and Bus capacity then confirm the booking
			if(booking.isAvailable(bookings,buses))
			{
				bookings.add(booking);
				System.out.println("Your ticket is confirmed. Have a great journey");
			}
			
			else
			{
				System.out.println("Sorry! Bus is full. Try different bus or date. Thanks!!");
			}
		}
		
		}

	}

}
