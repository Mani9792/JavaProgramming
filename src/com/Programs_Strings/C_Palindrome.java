package com.Programs_Strings;

public class C_Palindrome {

	public static void main(String[] args) {
		
		String st = "madam";
		
		int l = st.length();
		
		Boolean palindrome = true;
		
		for(int i = 0; i  < l/2; i++)
		{		
			if(st.charAt(i) != st.charAt(l-i-1) )
			{
				palindrome = false;
				break;
			}
		}
		
		System.out.println("Palindrome ? :" +palindrome);
       
	}

}
