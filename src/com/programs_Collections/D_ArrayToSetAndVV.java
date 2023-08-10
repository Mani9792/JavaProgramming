package com.programs_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class D_ArrayToSetAndVV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] obj = {"Mani",'A',15,18.90,"Mani"};
		
		for(Object e : obj)
		{
			System.out.println(e);
		}
		
		HashSet set = new HashSet(Arrays.asList(obj));
		
		System.out.println("Set is : "+set);
		
		

	}

}
