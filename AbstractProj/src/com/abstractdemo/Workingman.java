package com.abstractdemo;

public class Workingman extends Men 
{
	 void workingStatus()
	 {
		 age=33;
		 System.out.println("working man in private sector");
	 }

	public static void main (String [] args)
	{
		Men m2 = new Workingman();
		m2.workingStatus();
		System.out.println(m2);
	}
	
}
