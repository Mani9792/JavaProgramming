package com.Programs_Strings;

public class H_FizzBuzz {

	public static void main(String[] args) {
		
		int n = 20;
		
		for(int i = 1 ; i <= 20; i++)
		{
			if ((i%3 == 0) && (i%5 == 0))
			{
				System.out.print("FizzBuzz"+" ");
			}
			else if(i%3 == 0)
			{
				System.out.print("Fizz"+" ");
			}
			else if(i%5 == 0)
			{
				System.out.print("Buzz"+" ");
			}
			else
			{
				System.out.print(i+" ");
			}
		}

	}

}
