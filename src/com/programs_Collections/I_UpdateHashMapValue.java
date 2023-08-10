package com.programs_Collections;

import java.util.HashMap;
import java.util.Map;

public class I_UpdateHashMapValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Map <Integer, String> map = new HashMap <Integer, String>();
		
		map.put(101, "Mani");
		map.put(102, "Selvam");
		map.put(103, "Lakshmi");
		
		System.out.println(map);
		
		String val = map.get(101);
	
		map.put(101, "Saravana");
		
		System.out.println("Map after Update : ");
		
		System.out.println(map);
		
		

	}

}
