package interviewPrograms;

import java.util.Scanner;

public class F_ArmstrongNumber {
	//An Armstrong number of three digit is a number whose sum of cubes of its digit is equal * to its number. 
	//For example 153 is an Armstrong number * of 3 digit because 1^3+5^3+3^3 or 1+125+27=153
	
	public static boolean isArmstrong(int n)
	{
		int a = n;
		int result = 0;
		
		while(a != 0)
		{
		int remainder = a % 10;
		result = result + (remainder*remainder*remainder);
		a = a/10;
		}
		
		if(result == n)
			return true;
		else
		    return false;
	}



	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int armstrong = sc.nextInt();
		
		if(isArmstrong(armstrong))
		{
			System.out.println(armstrong+ " is armstrong");	
		}

		else
			System.out.println(armstrong+ " is not a armstrong");

	}

}
