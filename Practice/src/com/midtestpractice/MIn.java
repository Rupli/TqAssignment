package com.midtestpractice;

public class MIn {

	public static void main(String[] args)
	{
	  	
		int a[]= {1,5,4,3,2,4,1,2,4};
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
