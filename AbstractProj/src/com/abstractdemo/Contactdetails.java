package com.abstractdemo;

public class Contactdetails extends Phonebook 
{
	public void name()
	{
		System.out.println("show name of the person");
		
	}

	
	public void contact()
	{
		System.out.println("show contact number");
	}
	
	public static void main (String [] args)
	{
		Contactdetails cs = new Contactdetails();
		
		cs.contact();
		System.out.println(cs);
		cs.name();
	}
}
