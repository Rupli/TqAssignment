package com.demo;

public abstract class Univercity {
	
	int a;
	abstract void department();
    
	abstract void  fees();
	
	static void staff()
	{
		System.out.println("13");
	}
	
	final void facility()
	{
		System.out.println("all provide");
	}
	
	Univercity()//we can take constructor in abstract
	{
		
	}
	Univercity(int a)
	{
		this.a=a;
	}
}
