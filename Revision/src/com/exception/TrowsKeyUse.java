package com.exception;

import java.io.IOException;

public class TrowsKeyUse 
{
	void m1() throws IOException
	{
		throw new java.io.IOException("ioexception");
	}

	void m2() throws IOException
	{
		m1();
	}
	
	void m3()
	{
		try
		{
			m2();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main (String [] args)
	{
		TrowsKeyUse ts = new TrowsKeyUse();
		ts.m3();
		System.out.println("normal exception");
	}
	
}
