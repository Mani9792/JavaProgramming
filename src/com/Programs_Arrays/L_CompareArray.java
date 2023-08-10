package com.Programs_Arrays;

import java.util.Arrays;

public class L_CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {-45,56,43,-89,90,010,-77};
		int b[] = {-45,56,43,-89,90,010,-77};
		int c[] = a;
		
		if(a == b )
		{
			System.out.println("Array Elements of a & b are Same");
		}

		else
			System.out.println("Array Elements of a & b are not same");
		
		if(a == c )
		{
			System.out.println("Array Elements of a & c are Same");
		}

		else
			System.out.println("Array Elements of a & c are not same");
		
		//Limitation of == is it compare only reference not elements
		
		//so Arrays.equals
		
		if(Arrays.equals(a, b))
		{

		System.out.println("Array Elements of a & b are Same");

		}
		
		else
			System.out.println("Array Elements of a & b are not same");
		
	}

}
