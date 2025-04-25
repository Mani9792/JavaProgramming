package com.Programs_Arrays;

import java.util.Arrays;

public class T_BinarySearch {

	public static void main(String[] args) {
		
		int a[] = {10,56,24,90,45,100,89};  //Should be in sorted order
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int l = 0;
		int h = a.length-1;
		
		int key = 24;
		
		boolean flag = false;
		
		while(l<=h)
		{
		int mid = (l+h)/2;
		
		if(key == a[mid])
		{
			System.out.println("Element found at Index : "+mid);
			flag=true;
			break;
		}
		
		if(key > a[mid])
		{
			l = mid + 1;
		}
		
		if(key < a[mid])
		{
			h = mid - 1;
		}
		}
		
		if (flag == false)
		System.out.println("Element not found");	

	}

}
