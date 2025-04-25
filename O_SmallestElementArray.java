package com.Programs_Arrays;

public class O_SmallestElementArray {

	public static void main(String[] args) {
		
		double a[] = {298.09,245.76,564.89,-657.78,123.98};
		
		double min  = a[0];
		for(double arr : a)
		{
			if(min > arr)
			{
				min=arr;
			}
			
		}
		System.out.println("The Smallest Element is: "+min);

	}

}
