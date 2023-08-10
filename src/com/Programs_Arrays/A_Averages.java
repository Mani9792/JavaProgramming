package com.Programs_Arrays;

public class A_Averages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,30,40,50};
		int avg = 0;
		for(int arr : a)
		{
			avg = avg+arr;
		}
		System.out.println("The Average is: "+avg/a.length);
	}

}
