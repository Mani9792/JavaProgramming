package com.Programs_Arrays;

public class B_LargestElement {

	public static void main(String[] args) {
		
		double a[] = {298.09,245.76,564.89,657.78,-123.98};
		
		double max  = a[0];
		for(double arr : a)
		{
			if(max < arr)
			{
				max=arr;
			}
			
		}
		System.out.println("The largest Element is: "+max);

	}

}
