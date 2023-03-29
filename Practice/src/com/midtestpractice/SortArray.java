package com.midtestpractice;

import java.util.Arrays;

public class SortArray {
	
	public static void sort(int[] a)
	{
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
	}

	
	public static void main(String [] args)
	{
		int[] i= {2,8,6,4,2,4,1,4};
		
		
		sort(i);
		
		System.out.println(Arrays.toString(i));
		
	}
}
