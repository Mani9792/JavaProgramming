package com.Programs_Strings;

import java.util.Arrays;

public class I_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Mani ";
		String str2 = "amin   ";
		
		boolean status = true;
		
		String s1 = str1.replaceAll("\\s","").toLowerCase();
		String s2 = str2.replaceAll("\\s","").toLowerCase();
		
		System.out.println(s1+"-"+s2);
		
		if(s1.length() != s2.length())
			status = false;
		
		else
		{
			char[] arS1 = s1.toCharArray();
			char[] arS2 = s2.toCharArray();
			
			Arrays.sort(arS1);
			Arrays.sort(arS2);
			
			status = Arrays.equals(arS1, arS2);
		}
		
		if(status)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagram");

	}

}
