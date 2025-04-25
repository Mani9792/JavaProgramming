package arra;

import java.util.LinkedHashSet;

public class StringDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am Manikandan and I am a Test Engineer";
		
		s= s+ " ";
		
		System.out.println(s);
		
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
		System.out.println(s1[i]);
		}
		int count=1;
		
		String s3 = "";
		
		for(int i=0;i<s1.length-1;i++)
		{
			
			if(s1[i]==s1[i+1])
			{
				System.out.println(s1[i+1]);
				count++;
			}
			
			else
			{
				s3=s3+s1[i]+" ";
			}
			
			//s3=s3+s1[s1.length-1];
		}
		
		s3=s3+s1[s1.length-1];
		
		System.out.println(s3);
		System.out.println(count);
		
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(String e : s1)
		{
			set.add(e);
		}

		System.out.println(set.toString());
	}

}
