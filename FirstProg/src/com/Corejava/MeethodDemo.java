package com.Corejava;

public class MeethodDemo {
	
	static long calculateFactoriAl(int a)
	{
	
	  
	 a=10;
   	int fact=1;
   	for(int i=1;i<=a;i++) {
   	    fact=fact*i;
   	    return fact;
   	}
   	System.out.println(fact);
	}
	public static void main(String args[])
	{
		
		System.out.println (calculateFactoriAl(10));
		
	}
}

