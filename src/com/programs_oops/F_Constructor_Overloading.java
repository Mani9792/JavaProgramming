package com.programs_oops;

public class F_Constructor_Overloading {
	
	F_Constructor_Overloading(int x, int y)
	{
		System.out.println(x+y);
	}
	
	F_Constructor_Overloading(int x, int y,int z)
	{
		System.out.println(x-y+z);
	}
	
	F_Constructor_Overloading(double x, int y)
	{
		System.out.println(x-y);
	}
	

	public static void main(String[] args) {
		F_Constructor_Overloading o = new F_Constructor_Overloading(5,6);
		F_Constructor_Overloading o1 = new F_Constructor_Overloading(5,6,7);
		F_Constructor_Overloading o2 = new F_Constructor_Overloading(5.5,6);
	
	}

}
