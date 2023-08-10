package collectionsPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
		
		ArrayList al  = new ArrayList <String>();
		
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		System.out.println("Size of AL: "+al.size());
		
		al.remove(1); //al.remove("Welcome")
		System.out.println("After Removal: "+al);	
		
		al.add(1, "Welcome");
		System.out.println("After Insertion: "+al);
		
		al.set(1, "Hello");
		System.out.println("After Modification: "+al);
		
		al.get(2);
		System.out.println("After retrival: "+al.get(2));
		
		//Search
		al.contains("Hello");
		System.out.println("After Search: "+al.contains("Hello"));
		
		//
		System.out.println("Is it Empty: "+al.isEmpty());
		
		//For Each
		System.out.println("List is : ");
		for(Object e:al)
		{
			System.out.println(e);
		}
		
		//iterator
		System.out.println("List with Iterator : ");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList <Integer> al1 = new ArrayList();
		al1.add(10);
		al1.add(12);
		al1.add(9);
		al1.add(1);
		
		//Sorting
		Collections.sort(al1);
		System.out.println("After Sorting : "+al1 );
		
		//Sorting in reverse order
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println("After reverse Sorting : "+al1 );
		
		//Shuffle
		Collections.shuffle(al1);
		System.out.println("After Shuffling : "+al1 );
		
		//Convert Array to AL
		String arr[] = {"Dog","Cat"};
		for(String e: arr)
		{
			System.out.println(e);
		}
		ArrayList al3 = new ArrayList(Arrays.asList(arr));
		System.out.println(al3);
		
		
		
		
		
		

	}

}
