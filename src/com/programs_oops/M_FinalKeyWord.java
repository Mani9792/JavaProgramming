package com.programs_oops;

final class E   //--Final class
{
	final void m()  //final method
	{
		System.out.println("Final");
	}
}

class F //extends E   //  cant be extended if final
{
	void k()    // m() Cant be over rided if it is final
	{
		System.out.println("Final");
	}
}

public class M_FinalKeyWord {
	
	final int a = 56; //final variable
	
	
	public static void main(String[] args) {
		
		M_FinalKeyWord f = new M_FinalKeyWord();
		
		//f.a = 100;  //error will be thrown when made final
		
		System.out.println(f.a);  //56 -If Final //100 if not
		
		

	}

}
