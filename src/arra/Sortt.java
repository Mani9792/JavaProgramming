package arra;

public class Sortt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12,13,22,14,15};
		
		int n = arr.length;
		
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]+" ");
			
		}
		
		System.out.println(arr[2]);
		System.out.println(arr[n-1]);
		System.out.println(arr[n-2]);
		

	}

}
