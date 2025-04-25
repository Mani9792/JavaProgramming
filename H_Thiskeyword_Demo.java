package com.programs_oops;

public class H_Thiskeyword_Demo {
	
	int a,b;  //Instance Variables or Class Variables
	
	// Can Method variables can be of same name as Instance variables? NO, because it can't be differentiated
	
	//But to use the same name we can use "this" keyword - Represents Instance or Class Variables
	
	void getValues(int a, int b) //Method or External Variables
	{
		this.a = a;  
		this.b = b;
	}
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		H_Thiskeyword_Demo th = new H_Thiskeyword_Demo();
		
		th.getValues(10, 20);
		
		th.printValues();

	}

}
