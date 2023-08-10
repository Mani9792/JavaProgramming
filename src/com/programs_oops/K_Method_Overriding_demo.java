package com.programs_oops;


  class Bank
  {	  
	  double getInterest(int p, int n)
	  {
		  return p*n*10/100;
	  }
  }
  
  class SBI extends Bank
  {	  
	  double getInterest(int p, int n)
	  {
		  return p*n*9/100;
	  }
  }
  
  class ICICI extends Bank
  {	  
	  double getInterest(int p, int n)
	  {
		  return p*n*11/100;
	  }
  }
  
  class Axis extends Bank
  {	  
	  double getInterest(int p, int n)
	  {
		  return p*n*12/100;
	  }
  }
  
  

public class K_Method_Overriding_demo {

	public static void main(String[] args) {
		
		SBI s = new SBI();
		
		double s1 = s.getInterest(100, 2);
		
		System.out.println(s1);
		
        ICICI i = new ICICI();
		
		double i1 = i.getInterest(100, 2);
		
		System.out.println(i1);
		
        Axis a = new Axis();
		
		double a1 = a.getInterest(100, 2);
		
		System.out.println(a1);
	}

}
