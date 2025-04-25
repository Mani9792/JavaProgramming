package com.Programs_Arrays;

public class Y_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,1,8,17,25,12};
		
		int temp=0;
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			int index = i;
			
			for(int j = i+1 ; j < a.length ; j++)
			{
				if(a[j] < a[index])
				{
				   index = j;
				}
			}
			temp = a[index];
			a[index] = a[i];
			a[i] = temp;
		}
		
		System.out.println("Sort after Selection sort");
		
		for(int arr : a)
		{
			System.out.print(arr + " ");
		}

	}

}
