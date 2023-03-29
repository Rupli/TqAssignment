package com.exception;

import java.io.IOException;

public class ExceptionPropogation {

// compile time exception iys need throws
	void first() 
	{
		throw new  java.io.IOException("device error");//checked exception
	}
	void second()
	{
		first();
	}
	
	void third()
	{
		try
	{
		second();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

	public static void main (String []args)
	{
		ExceptionPropogation ep = new ExceptionPropogation();
		ep.third();
		System.out.println("normal exception");
	}
}
