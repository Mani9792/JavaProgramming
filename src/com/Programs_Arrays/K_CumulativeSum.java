package com.Programs_Arrays;

import java.util.Arrays;

public class K_CumulativeSum {
	//Traverse through the array.
	//Calculate the sum value as, sum = sum + array[i]
	//Replace the sum value with array[i]

	public static void main(String[] args) {
        int a[] = {-45,56,43,-89,90,010,-77};
        
        int cumSum = 0;

		for(int i = 0;i  < a.length; i++)
		{
			cumSum = cumSum+a[i];
			a[i] = cumSum;
		}
		
		System.out.println(Arrays.toString(a));
		

	}

}
