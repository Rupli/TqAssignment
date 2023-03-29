package com.practice;

public class CountWord1 
{
	public static int countword(String s)
	{
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)==' ')
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String [] args)
	{
		String s1= "java is object oriented progrraming";
		
		System.out.println(s1);
		int count =countword(s1);
		
		System.out.println(count);
	}
}
