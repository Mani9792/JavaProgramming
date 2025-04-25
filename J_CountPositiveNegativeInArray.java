package com.Programs_Arrays;

public class J_CountPositiveNegativeInArray {

	public static void main(String[] args) {
        int a[] = {-45,56,43,-89,90,010,-77};
        
        int posCount = 0;
		int negCount = 0;
		for(int c : a)
		{
			if(c > 0)
			{
				posCount++;
			}
			
			else
			{
				negCount++;
			}
		}
		
		System.out.println("Positive Numbers Count : "+posCount+ " and" + " Negative Numbers Count : "+negCount);

	}

}
