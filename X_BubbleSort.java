package com.Programs_Arrays;

public class X_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,34,76,43,81,8};
		
		int n = a.length;
		
		int temp = 0;
		
		for(int i = 0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(a[j-1] > a[j])
				{
				temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted elements");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
