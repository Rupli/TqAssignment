package com.abstractdemo;

public class Employee extends Wifi
{
	protected void getaccessed()
	{
		System.out.println("get accesed details ");
	}
    
	protected  void details()
	{
		System.out.println("show details  ");
	
	}
	public Employee()
	{
		super();
	}
	public Employee(String username,String password)
	{
		super();
		this.username=username;
		this.password=password;
		System.out.println("employee details");
	}

	public void admin()
	{
		this.username=username;
		this.password=password;
		System.out.println("admin can acess");
	}
	
	public static void main(String [] args)
	{
		Employee em = new Employee("ABC","rupali@123");
		System.out.println(em);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
