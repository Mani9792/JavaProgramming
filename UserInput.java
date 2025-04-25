package com.Programs_Arrays;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--Enter array Size--");
		
		int a_size = sc.nextInt();
		
		System.out.println("--Enter Array Elements--");
		
		int arr[] = new int[a_size];
		
		for(int i = 0; i <a_size; i++)
		{
			if(sc.hasNext())
			{
				arr[i] = sc.nextInt();
			}
		}

	}

}
