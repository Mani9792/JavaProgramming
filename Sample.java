package arra;

public class Sample {
	
	public static void main(String[] args) {
		
		String  s = "00200";
		
		int n = 0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='0')
				break;
			n++;			
		}
		System.out.println(n);
		s = s.substring(n);
		
		System.out.println(s);
	}

}
