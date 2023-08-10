package com.Programs_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class G_DispalyEvenOddInArray {

	public static void main(String[] args) {
        int a[] = {45,56,43,89,90,010,77};

		for(int c : a)
		{
			if(c % 2 == 0)
			{
				System.out.print(c+": even ");
			}
			
			else
			{
				System.out.print(c+": odd ");
			}
		} 
		//To get input from user
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Length : ");
		
		int n = s.nextInt();
		
		int numbers[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			numbers[i] = s.nextInt();
		}
		
		System.out.println(Arrays.toString(numbers));

	}

}
