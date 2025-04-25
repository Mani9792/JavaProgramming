package com.Programs_Strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class G_BalancedExpressions {

	public static void main(String[] args) {
		String s = "({[{}])";
		
		if(areBracketsBalances(s))
			System.out.println("Balanced Expression");
		else
			System.out.println("Not a Balanced Expression");

	}
	
	public static boolean areBracketsBalances(String str)
	{
		Deque<Character> stack  = new ArrayDeque<Character>();
		
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(c == '(' || c == '{' || c == '[')
			{
				stack.push(c);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char check;
			
			switch(c)
			{
			case ')':
				check = stack.pop();
				if(check == '{' || check == '[')
					return false;
				break;
			
			case '}':
				check = stack.pop();
				if(check == '(' || check == '[')
					return false;
				break;	
				
			case ']':
				check = stack.pop();
				if(check == '(' || check == '{')
					return false;
				break;	
			}
		}
		
		return (stack.isEmpty());
		
	}

}
