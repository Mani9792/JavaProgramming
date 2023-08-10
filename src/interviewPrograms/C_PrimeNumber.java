package interviewPrograms;

import java.util.Scanner;

public class C_PrimeNumber {
	
	static void primeNo(int n)
	{
		int flag = 0 ;
		int m = n/2;
		if(n==0 || n==1)
		{
			System.out.println(n + " is not a prime number");
		}
		else
		{
			for(int i = 2; i <= m; i++)
			{
				if(n%i == 0)
				{
					System.out.println(n + " is not a prime number");
				    flag = 1;
				break;
				}
			}				
			
			if(flag == 0)		
			{
				System.out.println(n+ " is a prime number");
			}
		}
			
	}

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		int p = sc.nextInt();
		
		primeNo(p);

	}

}
