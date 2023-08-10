package com.Programs_Arrays;

import java.util.Arrays;

public class V_InsertAddRemove_Element {

	public static void main(String[] args) {
		
	//a) Take a position and new array element.
	//b) Create a new array with the size of n+1, where n is the size of the original array.
	//c) Copy the element of the original array to the new array until position-1 index.
	//d) Insert an element at position index
	//e) Copy remaining elements of original array to new array
	//f) Return the new array
		
		int a[] = {1,3,5,6,7,0};
		
		//element to be Inserted and position
		
		int b = 10;
		
		int position = 3;
		
		int temp[] = new int[a.length+1];
		
		for(int i = 0, j = 0; i < a.length; i++)
		{
			if(i == position)
			{
				temp[i] = b;
			}
			else
			{
				temp[i] = a[j++];
			}
		}
		System.out.println("Original Array : "+Arrays.toString(a));
		System.out.println("Modified Array after Insertion : "+Arrays.toString(temp));
		
	// Add a element
		
        int temp1[] = new int[a.length+1];
        
        int lastElement = 78;
		
		for(int i = 0; i < a.length; i++)
		{
				temp1[i] = a[i];			
		}
		
		temp1[a.length] = lastElement;
		
		System.out.println("Modified Array after Addition: "+Arrays.toString(temp1));
		
	// Remove an element
		
        int temp2[] = new int[a.length-1];
        
        int position1 = 2;
		
		for(int i = 0,j=0; i < a.length; i++)
		{
			if(i == position1)	
			{
				continue;
			}
			//temp2[j++] = a[i];
			temp2[j++] = a[i];
		}
		
		System.out.println("Modified Array after removal: "+Arrays.toString(temp2));
	
	}

}
