package com.programs_oops;

public class I_Static_Demo {
	
	static int a = 10;
	int b = 30;
	
	static void m1() {
		System.out.println("static method");
		//System.out.println(b); --Cant access but as below thru object
		I_Static_Demo sd = new I_Static_Demo();
		System.out.println(sd.b);
	}
	
	void m2() {
		System.out.println("Non static method");
	}
	
	void m3() {
		//Non Static methods can access all stuffs.
		System.out.println("Non static method");
		System.out.println(a);
		System.out.println(b);
		m1();
	}

	public static void main(String[] args) {
		//Direct accessStatic methods can access only static stuffs - has direct access without any object creation.
		System.out.println(a);
		m1();
		
		//Not non static ones
		
		I_Static_Demo s = new I_Static_Demo();
		s.m2();
		System.out.println(s.b);
		
		//Non Static methods can access Static and Non Static stuffs
		I_Static_Demo s1 = new I_Static_Demo();
		
		s1.m3();
		
	}

}
