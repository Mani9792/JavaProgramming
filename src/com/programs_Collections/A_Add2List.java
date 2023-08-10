package com.programs_Collections;

import java.util.ArrayList;
import java.util.List;

public class A_Add2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list1 = new ArrayList();
		
		list1.add(100);
		list1.add("Mani");
		list1.add(15.56);
		list1.add("Null");
		
		System.out.println(list1);
		
        List list2 = new ArrayList();
		
		list2.add(101);
		list2.add("Selvam");
		list2.add(19.56);
		list2.add("Nullify");
		
		System.out.println(list2);
		
		List list3 = new ArrayList();
		
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println("Joined List: "+list3);
		
		
		// or we can use Union method of ListUtils class in Apache commons
		
		
		

	}

}
