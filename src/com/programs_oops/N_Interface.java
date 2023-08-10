package com.programs_oops;

interface InterfaceDemo
{
	int a = 10;  //--> Static and Final
	
	void m();   //abstract method and it is public by default
}

//Implement it in class



public class N_Interface implements InterfaceDemo {

	public void m()  //-- public should be added since it will be considered default if not mentioned which will throw error
	                 //--as Interface methods are public by default
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		InterfaceDemo d = new N_Interface();
		
	    d.m();
	    
	    //Or
	    
	    N_Interface n = new N_Interface();
	    
	    n.m();

	}

}
