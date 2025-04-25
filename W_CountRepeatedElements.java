package com.Programs_Arrays;

public class W_CountRepeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,1,2,2,3,3,4,4,6,6,5,5,7,7,8};
		
		int temp[] = new int[a.length];
		
		int count = 0;
		
		for(int i = 0; i< a.length; i++)
		{
			int element = a[i];
			
			boolean flag = false;
			
		    for(int j=0;j<count;j++)
		    {
		    	if(temp[j] == element)
		    	{
		    		flag = true;
		    		break;
		    	}		    	
		    }
		    
		    if(flag)
		    	continue;
		    
		    // Check elements in array for duplicates
		    
		    for(int j=i+1;j<a.length;j++)
		    {
		    	if(a[j] == element)
		    	{
		    		temp[count++] = element;
		    		//If found
		    		break;
		    	}
		    }
		    
		}
		
		    System.out.println("Total Repeated elements: "+count);
		    
		    System.out.println("Repeated elements: ");
		    
		    for(int k=0;k<count;k++)
		    {
		    	System.out.print(temp[k]+ " ");
		    }

	}

}
