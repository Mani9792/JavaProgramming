package com.programs_oops;

interface ABC
{
   int a=100;
   
   void m();	
}

interface XYZ
{
   int b=50;
   
   void m1();	
}

public class O_MultipleInheritanceDemo implements ABC,XYZ {
	
	public void m()
	{
		System.out.println(a);
	}
	
	public void m1()
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		ABC a = new O_MultipleInheritanceDemo();
		
		a.m();
		
		XYZ x = new O_MultipleInheritanceDemo();
		
		x.m1();			
				

	}

}
