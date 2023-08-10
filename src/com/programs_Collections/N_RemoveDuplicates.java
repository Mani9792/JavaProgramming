package com.programs_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class N_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am Manikandan. I am a test analyst";
		
		//Convert to array
		
		String[] s = str.split(" ");
	
		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(s));
		
		System.out.println(set);
		//Using Join to convert Set to String
		String q = String.join(" ", set);
		System.out.println(q);

	}

}
