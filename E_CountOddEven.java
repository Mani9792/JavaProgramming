package com.Programs_Arrays;

public class E_CountOddEven {

	public static void main(String[] args) {
		
		int a[] = {45,56,43,89,90,010,77};
		
		int evenCount = 0;
		int oddCount = 0;
		for(int c : a)
		{
			if(c % 2 == 0)
			{
				evenCount++;
			}
			
			else
			{
				oddCount++;
			}
		}
		
		System.out.println("Even Count : "+evenCount+ " Odd Count : "+oddCount);

	}

}
