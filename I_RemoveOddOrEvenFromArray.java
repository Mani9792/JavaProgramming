package com.Programs_Arrays;

import java.util.Arrays;

public class I_RemoveOddOrEvenFromArray {

	public static void main(String[] args) {
        int a[] = {45,56,43,89,90,010,77};
        
        int evenCount = 0;
		int oddCount = 0;
		int evenArray[] = null;
		int oddArray[] = null;
		for(int c : a)
		{
			if(c % 2 == 0)
			{
				evenCount++;
			}
			
			else
			{
				oddCount++;
			}
		}
		
		System.out.println("Even Count : "+evenCount+ " and" + " Odd Count : "+oddCount);
		
		evenArray = new int[evenCount];
		oddArray = new int[oddCount];
		int i = 0;
		int j = 0;
		for(int e : a)
		{
			if(e%2==0)
			{
			evenArray[i++] = e;
			}
		}
		
	    System.out.println("Removed Odd elements : "+Arrays.toString(evenArray));
	}

}
