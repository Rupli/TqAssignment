package com.practice;

public class CountWord 
{
	public static int countWord(String s)
	{
		int count=1;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
			count++;
		}
	}
		return count;
	}
	public static void main(String [] args)
	{
		String s1="this is java";
		System.out.println(s1);
		int count= countWord(s1);
		System.out.println(count);
		
	}

}
