package com.programs_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class B_ConvertArrayToListAndVV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array to List
		
		Object [] str = {"Mani",10,'A'};
		
		for(Object e : str)
		{
			System.out.println(e);
		}
		//Arrays to Al

		ArrayList al = new ArrayList(Arrays.asList(str));
		
		System.out.println("Arrays as List :" +al);
		
		//AL to Array
		
		Object[] str1 = al.toArray();
		
		System.out.println("AL as Array: ");
		for(Object e1 : str1)
		{
			System.out.println(e1);
		}
		
	}

}
