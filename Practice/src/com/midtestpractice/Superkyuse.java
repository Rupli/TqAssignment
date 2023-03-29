package com.midtestpractice;

class Parent {
	
	int i;
	Parent()
	{
		
	}
	public void display()
	{
		System.out.println("parent class");
	}
}

public class Superkyuse  extends Parent{
	
	public void display()
	{
		super.display();
		System.out.println("child class");
	}
	Superkyuse()
	{
		super(10);
	}

public static void main(String[] args)
{
	Superkyuse sp= new Superkyuse();
	sp.display();
	System.out.println(super.i);
}


	
	
	
	
	
	
}
