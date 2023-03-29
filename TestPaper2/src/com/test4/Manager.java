package com.test4;

public class Manager extends Emloyee
{
	 String company="accenture";
	
	
	 void details()
	{
		
		System.out.println("manager details"+ company);
	}
		
	 void incrementSalary()
	{
		System.out.println("30% increment of manager salary");
	}	
	
	public static void main (String[] args)
	{
		Manager m = new Manager();
		m.incrementSalary();
		m.details();
		
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


