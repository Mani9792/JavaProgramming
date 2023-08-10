package com.Programs_Arrays;

public class D_Sum_2DMatrix {

	public static void main(String[] args) {
		
		int rows =3;
		int columns = 3;
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}}; 
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}}; 
		
		int sum[][] = new int [rows][columns];
		
		for(int i = 0;i < rows; i++)
		{
			for(int j = 0;j < columns; j++)
			{
				sum[i][j] = a[i][j] + b[i][j]; 
			}
		}

		System.out.println("SUM OF MATRIX IS : ");
		
		for(int[] row : sum)
		{
			for(int col : row)
			{
			System.out.print(col + " ");	
			}
			System.out.println();
		}
	}

}
