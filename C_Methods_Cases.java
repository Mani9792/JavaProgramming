package com.programs_oops;

public class C_Methods_Cases {
	
	int a = 10;
	int b = 20;

	//Case 1: No parameters and No return value
	
	void sum()
	{
		System.out.println(a+b);
	}
	
	//Case 2: No Parameters but	Returns value
	
	int sum1()
	{
		return (a+b);
	}
	
	//Case 3: Parameters and No	Return value
	
	void sum2(int x, int y)
	{
		System.out.println(x+y);
	}
	
	//Case 4:  Parameters and Returns value
	
	int sum3(int x, int y)
	{
		return (x+y);
	}	
	
	public static void main(String[] args) {
		
		//Case 1
		System.out.println("-------Case 1: No parameters and No return value");
		C_Methods_Cases m = new C_Methods_Cases();
        m.sum();
        
        //Case 2	
        System.out.println("-------Case 2: No parameters But returns value");
        C_Methods_Cases m1 = new C_Methods_Cases();
        int s = m1.sum1();
        System.out.println(s);
        
      //Case 3	
        System.out.println("-------Case 3: Parameters and no return value");
        C_Methods_Cases m2 = new C_Methods_Cases();
        m2.sum2(10,10);
        
      //Case 4	
        System.out.println("-------Case 4: Parameters But returns value");
        C_Methods_Cases m3 = new C_Methods_Cases();
        int s1 = m1.sum3(20,20  );
        System.out.println(s1);        
        
	}

}
