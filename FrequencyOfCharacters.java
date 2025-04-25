package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		
		String s = "Manikandan";
		
		char[] ch = s.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		for(Map.Entry<Character,Integer> e  : map.entrySet())
		{
			if(e.getValue()>=1)
			{
				System.out.printf("%s : %d %n",e.getKey(),e.getValue());
			}
		}
	}

}
