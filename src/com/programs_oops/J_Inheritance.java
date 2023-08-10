package com.programs_oops;

class A
{
      int a;
      void print()
      {
    	  System.out.println(a);
	  }
}

class B extends A   // Single Inheritance
{
	  int b;
      void display()
      {
    	  System.out.println(b);
	  }
}

class C extends B   // Multi-level Inheritance
{
	  int c;
      void type()
      {
    	  System.out.println(c);
	  }
}

class D extends A   // Hierarchial Inheritance
{
	  int d;
      void screen()
      {
    	  System.out.println(d);
	  }
}



public class J_Inheritance {

	public static void main(String[] args) 
	{
		A aObj = new A();
		aObj.a = 10;
		aObj.print();
		
		System.out.println("----Single Inheritance");
		B bObj = new B();   //Single Inheritance  //Also Hierarchial Inheritance
		bObj.a = 30;        //bObj can'yt access d variable of another child class D of A
		bObj.b = 20;
		bObj.display();
		bObj.print();
		
		System.out.println("-----Multilevel Inheritance");
		C cObj = new C();   //Multi-Level Inheritance
		cObj.a = 40;
		cObj.b = 50;
		cObj.c = 60;
		
		cObj.print();
		cObj.display();
		cObj.type();
		
		System.out.println("-----Hierarchial Inheritance");
		D dObj = new D();   //Hierarchial Inheritance
		dObj.a = 70;
		dObj.d = 80;    //dObj can't access b variable of another child class B of A
		
		dObj.print();
		dObj.screen();

	}

}
