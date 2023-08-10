package com.programs_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C_HashMapAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map <Integer, String>m = new HashMap<Integer, String>();
		
		m.put(101,"Mani");
		m.put(102,"Selvam");
		m.put(103, null);
		m.put(null, null);
		
		System.out.println("Map : "+m);
		
		//Hashmap to List
		
		List <Integer> keys = new ArrayList(m.keySet()); 
		List <String> values = new ArrayList(m.values()); 
		
		System.out.println("Keys: "+keys+" Values: "+values);		

	}

}
