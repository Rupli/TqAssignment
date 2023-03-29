package com.test5;

public class MinVal {

	public static void main(String[] args) {


		int a[] = {12,3,5,4,11,4,8,6,233};

		int min= a[0];
		
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
