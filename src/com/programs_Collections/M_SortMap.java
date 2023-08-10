package com.programs_Collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class M_SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Map <Integer, String> map = new HashMap <Integer, String>();
		
		map.put(152, "SaRAVANA");
		map.put(142, "Selvam");
		map.put(103, "Lakshmi");
		
		//Using Tree Map
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(map);
		
		System.out.println("Sorted Keys");

		System.out.println(tmap);
		
		//Using Linked List and Entry
		
        List <Entry<Integer,String>>list1 = new LinkedList(map.entrySet());
 		
		list1.sort(Entry.comparingByValue());
		
		System.out.println(list1);
		
        List <Entry<Integer,String>>list2 = new LinkedList(map.entrySet());
		
		list2.sort(Entry.comparingByKey());
		
		System.out.println(list2);
		
		
		
	}

}
