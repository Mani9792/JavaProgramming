import java.util.HashMap;

public class SampleTest {

	public static void main(String[] args) {
		String s = "Test Test Test Engineer Engineer Analyst";
		
		String s1[] = s.split(" ");
		
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		
		for(int i = 0; i < s1.length;i++)
		{
			if(m.containsKey(s1[i]))
			{
				int count = m.get(s1[i]);
				m.put(s1[i], count+1);
			}
			else
			{
				m.put(s1[i], 1);
			}
		}
		
		System.out.println(m);
	}
}
	