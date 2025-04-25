package com.programs_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class G_ArrayListToStringAndVV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		al.add("Mani");
		al.add("is");
		al.add('a');
		al.add("Test Analyst");
		
		System.out.println("Al : "+al);
		
		//To  String
		
		String str = al.toString();
		System.out.println("The String is: "+str);
		
		//To String using Join
		
        ArrayList al2 = new ArrayList();
		
		al2.add("Mani");
		al2.add("is");
		al2.add("a");
		al2.add("Test Analyst");
		
		String s = String.join(" ", al2);
		
		System.out.println("The String using join is : "+s);
		
		//String to Array List
		
		String string = "Mani is a Test Analyst";
		
		//conv to array
		
		String[] arr = string.split(" ");
		
		ArrayList al3 = new ArrayList(Arrays.asList(arr));
		
		System.out.println("The AL is : "+al3);
		
		String sc = "Mani";
		
		char[] sca = sc.toCharArray();
		
		for(char e : sca)
		{
			System.out.println(e);
		}

	}

}
