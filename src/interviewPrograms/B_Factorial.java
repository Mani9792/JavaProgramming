package interviewPrograms;

import java.util.Scanner;

public class B_Factorial {
	
	static int factorial(int n){      
        if (n == 1)      
          return 1;      
        else      
          return(n * factorial(n-1));      
  }  
	
	public static void main(String[] args) {  
		
		int f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		f = sc.nextInt();
		
		System.out.println("Factorial of 5 is: "+factorial(f));  
		
	}  
	
}


