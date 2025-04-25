package com.programs_oops;

public class D_Constructors_Cases {
	
	int x, y;
	
	//Default Constructors
	D_Constructors_Cases() //Only to initialize values
	{
		x = 10;
		y = 10;
	}
	
	D_Constructors_Cases(int a, int b)
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x*y);
	}

	public static void main(String[] args) 
	{
		//Default Constructor
		
		D_Constructors_Cases cc =  new D_Constructors_Cases();
		
		cc.display();
		
		//Parameterized Constructor
		D_Constructors_Cases cc1 =  new D_Constructors_Cases(10,20);
		
		cc1.display();
	}

}
