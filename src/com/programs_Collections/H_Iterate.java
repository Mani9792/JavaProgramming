package com.programs_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class H_Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		list.add(1);
		list.add("Mani");
		list.add('a');
		list.add(15.56);
		
		Iterator itr = list.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next() + ", "); 
		}
		System.out.println("------");
		System.out.println("Map Iterated: ");
		Map <Integer, String> map = new HashMap <Integer, String>();
		
		map.put(101, "Mani");
		map.put(102, "Selvam");
		map.put(103, "Lakshmi");
		
        Iterator<Entry<Integer, String>> itrMap = map.entrySet().iterator();
		
		while(itrMap.hasNext())
		{
			System.out.println(itrMap.next() + ", "); 
		}
		Iterator<Integer> itrKey = map.keySet().iterator();
		System.out.println("Map Key Iterated: ");
		while(itrKey.hasNext())
		{
			System.out.println(itrKey.next()); 
		}
		
		Iterator<String> itrValues = map.values().iterator();
		System.out.println("Map Value Iterated: ");
		while(itrValues.hasNext())
		{
			System.out.println(itrValues.next()); 
		}
		//Using For each loop
		for(Entry<Integer,String> e :map.entrySet())
		{
			System.out.println(e);
		}
		
		System.out.println("------");
		System.out.println("Set Iterated: ");
		
		HashSet  set = new HashSet();
		
		set.add("Mani");
		set.add("Lakshmi");
		set.add("Selvam");
		set.add("Saravana");
		set.add("Mani");
		
		//Using iterator
		
		Iterator<String> itrSet = set.iterator();
		
		while(itrSet.hasNext())
		{
			System.out.println(itrSet.next());
		}
		
		//For each
        HashSet  set1 = new HashSet();
 		
		set1.add("Mani");
		set1.add("Lakshmi");
		set1.add("Selvam");
		set1.add("Saravana");
		set1.add("Mani");    
		for(Object s : set1)
		{
			System.out.println(s);
		}
			
			

	}

}
