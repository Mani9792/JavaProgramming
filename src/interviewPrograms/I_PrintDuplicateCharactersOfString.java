package interviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class I_PrintDuplicateCharactersOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDuplicateCharacters("Manikandan");
		printDuplicateCharacters("Manikandan Selvam");
		printDuplicateCharacters("aaaaaaaaaaaaaaaaaa");
		
	}
	
	public static void printDuplicateCharacters(String s)
	{
		//Convert the String to char array
		
		char[] ch = s.toCharArray();
		
		//Create map object to store them to traverse
		
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(char c : ch)
		{
			if(charMap.containsKey(c))
			{
	//Checking whether the char is already part of map, if yes add them with Incremented key value
				charMap.put(c, charMap.get(c)+1); 
			}
			
			else
				charMap.put(c, 1);
		}
		
   //let us put the map into entryset to iterate and print duplicates
			
		Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		
		System.out.printf("List of duplicate characters in the String '%s' %n",s);
		
		for(Map.Entry<Character,Integer> entry  : entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
			}
		}		
	}

}
