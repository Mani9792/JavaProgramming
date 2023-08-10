package com.programs_Collections;

import java.util.LinkedList;

public class F_MiddleElementInLinkedList {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.addFirst("Mani");
		ll.add("Saravana");
		ll.add("Lakshmi");
		ll.add("Selvam");
		ll.addLast("House");
		ll.add("God");
		
		System.out.println("Middle Element is :"+ll.get(ll.size()/2));

	}

}
