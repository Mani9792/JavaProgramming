package interviewPrograms;

import java.util.Scanner;

public class E_PalindromeString {
	
	public static boolean isPalindromeString(String s)
	{
		String reverse ;
		String s1 = s;
		
		StringBuffer sb = new StringBuffer(s1);
		
		reverse = sb.reverse().toString();
		
		if(s .equalsIgnoreCase(reverse))
			return true;
		else			
		    return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String s = sc.next();
		
		if(isPalindromeString(s))
		{
			System.out.println(s+ " is a palindrome string");
		}

		else
			System.out.println(s+ " is a not palindrome string");
		
		System.out.println("---without astring buffer class---");
		String r = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			r = r + s.charAt(i);
		}
		
		System.out.println(r);
		
		if(r.equalsIgnoreCase(s))
		{
			System.out.println("it is palindrome");
		}
		else
			System.out.println("it is not palindrome");
	}

}
