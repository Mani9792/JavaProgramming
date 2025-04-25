package com.Programs_Arrays;

import java.util.Arrays;

public class M_CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {-45,56,43,-89,90,010,-97};
		int c[] = a;

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c)); // when a is changed c is also changed so not effective
		
		//Loop
		int b[] = new int[a.length];
		for(int i = 0 ; i < a.length; i++)
		{
			b[i] = a[i];
		}
		a[0]=12;
		System.out.println("Mod Array: "+Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		//System.arrayCopy
		int newArr[] = new int[a.length];
		System.arraycopy(a, 0, newArr, 0, a.length);
		a[0]=14;
		System.out.println("Mod Array: "+Arrays.toString(a));
		System.out.println(Arrays.toString(newArr));
		
		//copyOf
		
		int newArr1[]  = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(newArr1));
		
		//CopyOfRange
		
		int newArr2[] = Arrays.copyOfRange(a, 1, 3);
		System.out.println(Arrays.toString(newArr2));
		
		//clone
		
		int newArr3[] = a.clone();
		System.out.println(Arrays.toString(newArr3));
		
	}

}
