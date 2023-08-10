package com.Programs_Arrays;

import java.util.Arrays;

public class Q_ReverseArray {

	public static void main(String[] args) {
		
		int a[] = {30,40,50,70,90};
		
		int b[] = new int[a.length];
		
		System.out.println(a.length);
		
		int j=0;
		
		for(int i=a.length-1;i>=0;i--)
		{
			b[j++] = a[i];
		}

		System.out.println("Reversed Array is : "+Arrays.toString(b));
	}

}
