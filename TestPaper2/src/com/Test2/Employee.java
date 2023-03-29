package com.Test2;

public class Employee {

	
    public int id=1;
	public String name="ruvi";
	public Float sallary=33000.3f;
	public float experince=2.5f;
	public  int age=22;
	
	public Employee()
	{
		System.out.println("default constructer");
	}
	public Employee(float exp)
	{
		this. experince=2.0f;
		System.out.println("constructer 1");
	}
	
	public Employee(int id,String nm,Float sallary,float exp,int age)
	{
		this.id=99;
		this.name="sharu";
		this.sallary=11123.2f;
		this. experince=2.5f;
		this.age=23;
		System.out.println("constructer 2");
	}
	
	
}
