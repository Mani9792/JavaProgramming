package com.Programs_Strings;

public class B_StringReverse {

	public static void main(String[] args) {
		
		String st = "Mani";
		
		StringBuffer sb = new StringBuffer(st);
		
		String reverseString = sb.reverse().toString();
		
		System.out.println(reverseString);
		
		String reverse = "";
		
		for(int i = st.length()-1; i>=0;i--)
		{
			reverse = reverse+st.charAt(i);
		}

		System.out.println(reverse);
	}

}
