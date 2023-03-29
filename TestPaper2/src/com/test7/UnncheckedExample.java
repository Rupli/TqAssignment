package com.test7;

public class UnncheckedExample 
{
	void first()
	{
		int data =50/0;
	}
	void second()
	{
		first();
	}
	void third()
	{
		try {
			second();
		}
		catch(Exception e)
		{
		System.out.println("exception handling");
		
			
		}
		public static void main(String[] args)
		{
			
		}
	}

}
