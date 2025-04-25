package arra;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class DupArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ArrayList<Integer> list1 = new
		 * ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,5,6,6,7,7));
		 * 
		 * System.out.print("1st list is:"+list1);
		 * 
		 * ArrayList<Integer> list2 = new ArrayList<Integer>();
		 * 
		 * for(int e:list1) { if(!list2.contains(e)) { list2.add(e); } }
		 * 
		 * System.out.print("\nlist w/o duplicates: "+list2);
		 */
		
		String dateTime= "12/12/2022 2:00 PM";
		
		String date[] = (dateTime.split(" ")[0]).split("/");
		
		int date1= Integer.parseInt(date[2]);
		
		System.out.println(date1);
		
		/*
		 * //String time = dateTime.split(" ")[1]+" "+ dateTime.split(" ")[2];
		 * 
		 * Object time2 = dateTime.split(" ")[1];
		 * 
		 * DateTimeFormatter ft = DateTimeFormatter.ofPattern("H:MM");
		 * 
		 * //int time1= Integer.parseInt(time2);
		 * 
		 * System.out.println(ft.format(time2));
		 */

		String time = dateTime.split(" ")[1]+" "+ dateTime.split(" ")[2];
		
		System.out.println(time);
	}

}
