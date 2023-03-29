package com.midtestpractice;

public class Max {

	public static void main(String[] args) {
		
		int m []= {44,3,22,11,77,90};
		
		int max=m[0];
		
		for(int i=0;i<m.length;i++)
		{
			if(m[i]>max)
			{
				max=m[i];
			}
		}
		System.out.println(max);
		
	}

}
