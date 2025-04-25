package com.programs_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class K_GetKeyFromMapUsingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Map <Integer, String> map = new HashMap <Integer, String>();
		
		map.put(101, "Mani");
		map.put(102, "Selvam");
		map.put(103, "Lakshmi");
		
		String value = "Lakshmi";
		
		System.out.println(map);
		
		for(Entry<Integer,String> e: map.entrySet())
		{
			if(e.getValue() == value )
			{
				System.out.println("The key for " +value+ "  is : " +e.getKey());
			}
		}

	}

}
