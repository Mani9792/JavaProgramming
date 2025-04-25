import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(101,"Mani");
		m.put(102,"Selvam");
		m.put(103,"Palinga");
		m.put(104,"Viswa");
		m.put(105,"Null");
		
		System.out.println("Map set is : "+m);
		
		
		System.out.println("Map set is : "+m.get(101));
		
		m.remove(101);
		System.out.println("Map set is : "+m);
		
		System.out.println("Map set is : "+m.containsKey(101));
		
		System.out.println("Map set is : "+m.containsValue("Selvam"));
		
		System.out.println("Map set is : "+m.isEmpty());
		
		System.out.println("Map set is : "+m.keySet());
		
		System.out.println("Map set is : "+m.values());
		
		System.out.println("Map set is : "+m.entrySet());
		
		//Only keys
		for(int i: m.keySet())
		{
			System.out.println(i);
		}
		//only values
		for(String s : m.values())
		{
			System.out.println(s);
		}
		//both keys with values
		for(int i: m.keySet())
		{
			System.out.println(i +" "+m.get(i));
		}
		
		//Entry Methods
		System.out.println("ENTRIES");
		for(Map.Entry e :m.entrySet() )
		{
			System.out.println(e);
			
		}
		System.out.println("ENTRIES");
		for(Map.Entry e :m.entrySet() )
		{
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
		//Iterator
		System.out.println("Entries using Iterator");
		Set t = m.entrySet();
		
		Iterator itr = t.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry1 = (Entry) itr.next();
			System.out.println(entry1.getKey()+" "+entry1.getValue());
		}
		

	}

}
