package com.Programs_Strings;

public class F_CountNoOfWords {

	public static void main(String[] args) {
		
		String s = "Mani is Good";
		
		System.out.println(s.split(" ").length);
		
		//But this won’t work if your string is not properly formatted and 
		//it contains leading and trailing spaces, duplicate multiple spaces and tabs.
		
		String s1 = "    Mani is Good man ";
		//So use trim initially to remove intial spaces
		System.out.println(s1.trim().split(" ").length);
		

	}

}
