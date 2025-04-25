package interviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Z_FrequencyOfCharactersInString {
	public static void main(String[] args) 
	{

	String str = "Manikandan";
	
	char s[] = str.toCharArray();
	
	HashMap<Character,Integer> m = new HashMap<Character,Integer>();
			
	for(int i=0;i<s.length;i++)
	{
		if(m.containsKey(s[i]))
		{
			int count = m.get(s[i]);
			m.put(s[i], count+1);
		}
		else
		{
			m.put(s[i], 1);
		}
	}
	System.out.println(m);
	
	Iterator<Entry<Character, Integer>> itr = m.entrySet().iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	for(Map.Entry<Character,Integer> it : m.entrySet())
	{
		System.out.println(it.getKey() +":"+ it.getValue() );
	}
	}
}
