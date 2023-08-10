package com.Programs_Strings;

public class D_RemoveOccurenceOfString {

	public static void main(String[] args) {
		
		String st = "ManiKandan";
		
		String result = st.replaceAll(String.valueOf('a'), "");
		
		System.out.println("Modified String : "+result);

	}

}
