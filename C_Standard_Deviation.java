package com.Programs_Arrays;

public class C_Standard_Deviation {
	
	//To find Standard deviation
	//1.Find the sum of elements
	//2.Find Mean
	//3.For each data point, find the square of its distance to the mean.
	//4.Square root of distance added

	public static void main(String[] args)
	{
		double[] elements = {298.09,245.76,564.89,657.78,-123.98};
		
		double standardDeviation = calculateSD(elements);
		
		System.out.println("The SD is : "+standardDeviation);
		
		System.out.format("The Standard deviation = %2f",standardDeviation);
		
	}
	
	public static double calculateSD(double[] elements)
	{
		double sum = 0;
		double mean;
		double sd = 0.0;
		
		//1.Find the sum of elements
		for(double e : elements)
		{
			sum+=e;
		}
		int length = elements.length;
		//2.Find Mean
		mean = sum/length;
		//3.For each data point, find the square of its distance to the mean.
		for(double e1 : elements)
		{
		    sd = Math.pow(e1-mean, 2);
		}    
		//4.Square root of distance added    
		return Math.sqrt(sd);
	}

}
