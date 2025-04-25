package com.programs_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class L_UnionIntersectDifferenceSubsetOfSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        LinkedHashSet set = new LinkedHashSet();
		
		set.add("Mani");
		set.add("Lakshmi");
		set.add("Selvam");
		set.add("Saravana");
		set.add("Mani");
		
		LinkedHashSet  set1 = new LinkedHashSet();

		set1.add("Lakshmi");
		set1.add("Selvam");
		set1.add("Rocky");
		set1.add("Karuppa");
		
		System.out.println(set);
		
        System.out.println("Intersection of Sets: ");
		
		set.retainAll(set1);
		
        System.out.println("Difference of Sets: ");
		
		set.removeAll(set1);
		
		System.out.println(set);
		
		System.out.println("Union of Sets: ");
		
		set.addAll(set1);
		
		System.out.println(set);
		
		System.out.println("Subset of Sets: ");
		
		boolean subset = set.containsAll(set1);
		
		System.out.println(subset);
		
		
		
        
		

		
		
		
		
		
		

	}

}
