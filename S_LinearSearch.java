package com.Programs_Arrays;

public class S_LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {23,78,34,22,12,90};
		
		int key = 78;
		int index = 0;
		for(int i = 0; i< a.length;i++)
		{
			if(a[i] == key)
			{
				index = i;				
			}			
		}
		if(index == 0)
		    System.out.println("Key not found");
		else
			System.out.println("Index of the "+ key +" is : "+index);
	}

}
