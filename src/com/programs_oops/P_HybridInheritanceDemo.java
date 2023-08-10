package com.programs_oops;

class CB
{
	int q=100;
	
	void m0() {
		
		System.out.println("It will be Extended to child class: "+q);
	}
}

interface AB
{
   int a=100;
   
   void m();	
}

interface XY
{
   int b=50;
   
   void m1();	
}

public class P_HybridInheritanceDemo extends CB implements AB,XY{  //Hybrid Inheritance
	
	public void m()
	{
		System.out.println("This is Interface method m : "+a);
	}
	
	public void m1()
	{
		System.out.println("This is Interface method m1 : "+b);
	}

	public static void main(String[] args) {
		
		P_HybridInheritanceDemo p = new P_HybridInheritanceDemo();
		
		p.m0();  // Super class extended
		p.m();   // Interface Implemented
		p.m1();  // Interface Implemented
		
		
		

	}

}
