package com.Programs_Arrays;

import java.util.Arrays;

public class R_GCDHCF {

	public static void main(String[] args) {
		
    // Take two numbers
	// Find the largest & smallest number among them
	// Subtract the smallest number value from the largest number
	// Repeat this process until both numbers become equal
		
		int a[] = {10,15,20};
		
		int num1 = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			int num2 = a[i];
			
			while(num1 != num2)
			{
				if(num1>num2)
					num1 = num1-num2;
				else
					num2 = num2-num1;
			}
		}
		
		System.out.println(num1);

	}

}
