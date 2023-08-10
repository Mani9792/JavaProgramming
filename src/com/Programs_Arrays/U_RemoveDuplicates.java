package com.Programs_Arrays;

import java.util.Arrays;

public class U_RemoveDuplicates {

	public static void main(String[] args) {
		
		int a[] = {10,56,24,90,90,10,56};
		
		Arrays.sort(a);
		
		System.out.println("Sorted Original Array : "+Arrays.toString(a));
		
		int size = a.length;
		
		int lastIndex = a.length-1;
		
		int j = 0;
		
		for(int i = 0 ;i<lastIndex;i++)
		{
			if(a[i] != a[i+1])
			{
				a[j++] = a[i];
			}
		}
		
		if(a[j] != a[lastIndex])
		{
			a[j++] = a[lastIndex];
		}
		
		System.out.println(Arrays.toString(Arrays.copyOf(a, j)));

	}

}
