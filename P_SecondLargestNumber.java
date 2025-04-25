package com.Programs_Arrays;

public class P_SecondLargestNumber {

	public static void main(String[] args) {
		
		//Assign first element of the array to both variable i.e. fmax = arr[0]; smax = arr[0];
		//Iterate through all elements of the array using the loop
		//Check the ith element in the array is greater than fmax?
		//If yes, then update smax = fmax variable and fmax = arr[i]
		//Else if, the ith element in the array is greater than smax?
		//Then update smax = arr[i]
		
		double a[] = {298.09,245.76,564.89,657.78,-123.98};
		
		double max  = a[0];
		double smax = a[0];
		for(double arr : a)
		{
			if(max < arr)
			{
				max=arr;
				smax = max;
			}
			
			else if (smax < arr)
			{
				smax=arr;
			}
			
		}
		System.out.println("The largest Element is: "+smax);

	}

}
