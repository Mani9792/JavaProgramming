package com.programs_oops;

public class G_Main_Method_Overloading {
	
	public void main(int x, int y)
	{
		System.out.println(x+y);
	}
	
	public void main(int x, int y,int z)
	{
		System.out.println(x-y+z);
	}

	public static void main(String[] args) {
	
		G_Main_Method_Overloading o = new G_Main_Method_Overloading();
		
		o.main(0, 4);
		o.main(0, 4, 8);
	}

}
