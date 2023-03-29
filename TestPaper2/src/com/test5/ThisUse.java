package com.test5;

public class ThisUse
{
	int a;
	
	ThisUse()
	{
		System.out.println("first  constructor");
	}

	ThisUse(int a)
	{
		this();//calling first construct
		System.out.println();

	}
	void first()
	{
		System.out.println("first method");
	}
	void two()
	{
		System.out.println(this.a);
		this.first();
	}
}
