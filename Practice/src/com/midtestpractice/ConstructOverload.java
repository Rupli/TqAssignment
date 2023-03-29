package com.midtestpractice;

public class ConstructOverload 
{
	public int a;
	private String name;
	String schoolname;
	
	ConstructOverload()
	{
		System.out.println("default");
	}
	ConstructOverload(int a)
	{
		this.a=a;
	}
	ConstructOverload(int a,String name)
	{
		this(a);
		this.name=name;
		
	}

	ConstructOverload(int a,String name,String schoolname)
	{
		this(a,name);
		this.schoolname=schoolname;
		
	}
	
	public String toString()
	{
		return "id:" + a + name + schoolname;
	}
	
	public static void main(String [] args)
	{
		ConstructOverload cs= new ConstructOverload(1,"rupali");
		System.out.println(cs);
	}
}
