package collectionsPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.add(100);
		l.add("Wlecome");
		l.add(15.5);
		l.add('a');
		l.add(null);
		
		System.out.println(l);
		
		System.out.println("Size of List is : "+l.size());
		
		l.remove(1); //l.remove("Welcome")
		System.out.println("After Removl: "+l);	
		
		l.add(1, "Welcome");
		System.out.println("After Insertion: "+l);
		
		l.set(1, "Hello");
		System.out.println("After Modification: "+l);
		
		l.get(2);
		System.out.println("After retrivl: "+l.get(2));
		
		//Search
		l.contains("Hello");
		System.out.println("After Search: "+l.contains("Hello"));
		
		//
		System.out.println("Is it Empty: "+l.isEmpty());
		
		//For Each
		System.out.println("List is : ");
		for(Object e:l)
		{
			System.out.println(e);
		}
		
		//iterator
		System.out.println("List with Iterator : ");
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		LinkedList <Integer> l1 = new LinkedList();
		l1.add(10);
		l1.add(12);
		l1.add(9);
		l1.add(1);
		
		//Sorting
		Collections.sort(l1);
		System.out.println("After Sorting : "+l1 );
		
		//Sorting in reverse order
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("After reverse Sorting : "+l1 );
		
		//Shuffle
		Collections.shuffle(l1);
		System.out.println("After Shuffling : "+l1 );
		
		//Convert Array to l
		String arr[] = {"Dog","Cat"};
		for(String e: arr)
		{
			System.out.println(e);
		}
		LinkedList l3 = new LinkedList(Arrays.asList(arr));
		System.out.println(l3);
		
		l.addFirst("Mani");
		l.addLast("Last");
		System.out.println("After Addition: "+l);
		
		System.out.println("Get First : "+l.getFirst());
		System.out.println("Get Last: "+l.getLast());
		
		l.removeFirst();
		l.removeLast();
		System.out.println("After removal: "+l);
		
		

	}

}
