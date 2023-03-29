package com.abstractdemo;

public class Businessman extends Men

{
	String name;
	void workingStatus()
	{
		age=23;
		System.out.println("working status business man");
	}
	
	public Businessman ()
	{
		super();
	}

	public Businessman (int age,String name)
	{
		super();
		
		this.name=name;
		System.out.println("business man");
	}
	
	public static void main (String [] args)
	{
		
	Men m1 = new Businessman(22,"ravi");
	m1.workingStatus();
	System.out.println(m1);
	
	
	}


}