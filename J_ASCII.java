package com.Programs_Strings;

import java.util.Scanner;

public class J_ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    String word = sc.next();
	    int asciiValue = 0;
	    for(int i = 0; i< word.length(); i++)
	    {
	       asciiValue += word.charAt(i);
	       System.out.println(asciiValue);
	    }
	}

}
