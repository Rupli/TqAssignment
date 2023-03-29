package com.midtestpractice;

public abstract class A {
	
	//abstract and non abstract methos
	int a;
	abstract void  bag();

	public void gift()
	{
		System.out.println("watch");
	}
	
	A() ///constructor
	{
		
	}
	
	A(int a)
	{
		this.a=a;
	}
	
	public String toString()
	{
		return "a"+ a;
	}
}
