package interviewPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "CTS Testing team";
		
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));	
		}
		
		for(Character c : hs)
		{
			System.out.print(c);
		}
		
	}
}
