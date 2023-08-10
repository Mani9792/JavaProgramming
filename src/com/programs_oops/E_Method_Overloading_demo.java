package com.programs_oops;

public class E_Method_Overloading_demo {
	
	void add(int x, int y)
	{
		System.out.println(x+y);
	}
	
	void add(int x, int y,int z)
	{
		System.out.println(x-y+z);
	}
	
	void add(double x, int y)
	{
		System.out.println(x-y);
	}
	
	double add(int x, int y, double z)
	{
		return (double) (x*y*z);
	}

	public static void main(String[] args) 
	{
		E_Method_Overloading_demo o = new E_Method_Overloading_demo();
		
		o.add(1, 1);
		o.add(3.67, 2);
		o.add(1, 2, 3);
		
		double m = o.add(4, 3, 5.6);
		System.out.println(m);

	}

}
