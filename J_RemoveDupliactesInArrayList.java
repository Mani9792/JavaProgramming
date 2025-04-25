package com.programs_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class J_RemoveDupliactesInArrayList {

	public static void main(String[] args) {
		
        List <String> list = new ArrayList<String>();
		
		list.add("Selvam");
		list.add("Mani");
		list.add("Lakshmi");
		list.add("Saravana");
		list.add("Selvam");
		list.add("Mani");
		list.add("Lakshmi");
		list.add("Saravana");
		
		System.out.println("The Array List with duplicates: ");
		System.out.println(list);
		
		//Convert list to Set

		Set<String> set = new HashSet<String>();
		
		set.addAll(list);
		
		//Delete the list values
		
		list.clear();
		
		list.addAll(set);
		System.out.println("The Array List with out duplicates: ");
		System.out.println(list);

	}

}
