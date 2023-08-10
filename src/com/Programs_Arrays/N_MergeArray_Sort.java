package com.Programs_Arrays;

import java.util.Arrays;

public class N_MergeArray_Sort {

	public static void main(String[] args) {
		
		int a[] = {-45,56,43,-89,90,010,-97};
		int b[] = {5,56,0,10,7};
		
		int newArr[] = new int[a.length+b.length];
		
		for(int i =0;i<a.length;i++)
		{
			newArr[i]  = a[i];
		}
		
		for(int i =0,j=a.length;j<(a.length+b.length);j++,i++)
		{
			newArr[j]  = b[i];
		}
		
		System.out.println("Merged Array  : "+Arrays.toString(newArr));
		
		
		//Using System.Arrays.copy
		
		int newArr1[] = new int[a.length+b.length];
		
		//Copy the 1st array
		
		System.arraycopy(a, 0, newArr1, 0, a.length);
		
		System.arraycopy(b, 0, newArr1, a.length, b.length);
		
		Arrays.sort(newArr1);
		
		System.out.println("Merged Array  : "+Arrays.toString(newArr1));
		
		String c[] = {"Java", "Python", "C++"};
	    String d[] = {"HTML", "CSS", "JavaScript"};
	    
        String newArr2[] = new String[c.length+d.length];
		
		//Copy the 1st array
		
		System.arraycopy(c, 0, newArr2, 0, c.length);
		
		System.arraycopy(d, 0, newArr2, c.length, d.length);
		
		Arrays.sort(newArr2);
		
		System.out.println("Merged Array  : "+Arrays.toString(newArr2));
		
		
		

	}

}
