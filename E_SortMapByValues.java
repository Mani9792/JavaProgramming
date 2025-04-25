package com.programs_Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class E_SortMapByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(100, "Mani");
		map.put(102, "Saravana");
		map.put(104, "Lakshmi");
		map.put(109, "Selvam");
		map.put(108, "Kandan");
		
		System.out.println(map);
		
		List <Entry<Integer,String>>list1 = new LinkedList(map.entrySet());
		
		list1.sort(Entry.comparingByValue());
		
		System.out.println(list1);
		
        List <Entry<Integer,String>>list2 = new LinkedList(map.entrySet());
		
		list2.sort(Entry.comparingByKey());
		
		System.out.println(list2);
	}

}
