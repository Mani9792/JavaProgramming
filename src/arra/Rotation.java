package arra;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		System.out.println(LocalDateTime.now());
		
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	
	System.out.println("Org Array: ");
	
	for(int i=0;i<a.length;i++)
	{
    System.out.print(a[i]+ " ");
	}
	
	Scanner sc = new Scanner(System.in);
	System.out.println("\nEnter No of Rotation: ");
	int n =sc.nextInt();
	
	for(int i=0;i<n;i++)
	{
		int temp=a[0];
		
		for(int j=0;j<a.length-1;j++)
		{
			a[j]=a[j+1];
		}
		
		a[a.length-1]=temp;
			
	}
	
	System.out.println("Output Array: ");
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
		
	
	}
	
	
	}

