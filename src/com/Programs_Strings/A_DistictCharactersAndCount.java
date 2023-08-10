package com.Programs_Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class A_DistictCharactersAndCount {
	
	public static void main(String [] args)
	{

	String s1 = "Manikandan is a test analyst";
	String s = s1.toLowerCase();
	System.out.println("Distinct Chracters: ");
	for(int  i =0; i< s.length();i++)
	{
		int flag = 0;
		for(int j = 0;j< s.length();j++)
		{
			if(s.charAt(i) == s.charAt(j) && i != j)
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 0)
			System.out.print(s.charAt(i)+" ");		
	}
	System.out.println("");
	//Count
	
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	
	for(int i = 0; i < s.length();i++)
	{
		set.add(s.charAt(i));
	}
	System.out.println(set);
	System.out.println("Count of Distinct Charcters: "+set.size());
	}
	
}
