package interviewPrograms;

import java.util.Scanner;

public class D_PalindromeNumber {
	
	public static boolean isPalindrome(int n)
	{
		int p = n;
		int reverse = 0;
		
		while(p != 0)
		{		
		int remainder = p % 10;
		
		reverse = reverse*10 + remainder;
		
		p = p/10;
		}
		
		if(n == reverse)
		{
			return true;
		}
		
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int palindrome = sc.nextInt();
		
		if(isPalindrome(palindrome))
		{
			System.out.println(palindrome+ " is Palindrome");	
		}

		else
			System.out.println(palindrome+ " is not a Palindrome");
	}

}
