package com.test4;

public class AmbiguityMethodOverL
{
	static void sum(int z)
	{
		System.out.println("a ");
	}
	static void sum(float a , int b) 
	{
		System.out.println("sum of two digit"+ a+b);
	}
	
	static void sum(int a, float b)
	{
		System.out.println("sum of "+ a+b);
	}
	
	public static void main(String [] args)
	{
		AmbiguityMethodOverL a = new AmbiguityMethodOverL();
		a.sum(4, 9);
		//ambigute issue
	}
	
	
	
	
	
	
	
	
	  

}
