package com.Programs_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class H_SumOfOddEvenSeparately {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int n;
		
		System.out.println("Enter Length : ");
		
		n = s.nextInt();
		
		int[] num = new int[n];
		
		for(int i = 0; i < n;i++)
		{
			num[i]=s.nextInt();
		}

		System.out.println("Array Elements are : "+Arrays.toString(num));
		
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int e : num)
		{
			if(e%2==0)
			{
				sumEven+=e;
			}
			else
			{
				sumOdd+=e;
			}
		}
		
		System.out.println("Sum of even numbers : "+sumEven);
		System.out.println("Sum of odd numbers : "+sumOdd);
	}

}
