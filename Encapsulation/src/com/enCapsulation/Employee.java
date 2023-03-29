package com.enCapsulation;

public class Employee 
{
	private int empid;
	private String  name;
	private double sallary;
	
	//getter setter
	
	public void setEmpid(int empid )//setter
	{
		this.empid=empid;
	}
	
	public int getEmpid() //getter
	{
		return this.empid;
	}
	
    public void setName(String name)
    {
    	this.name=name;
    	
    }
    
    public String getName()
    {
    	return this.name;
    }
    
    public void setSallary(double sallary)
    {
    	this.sallary=sallary;
    }
    public double getSallary()
    {
    	return this.sallary;
    }
}
