package com.abstractdemo;

public class Unicorn extends Bike
{
	int gear;
	
	void changespeed()
	{
		System.out.println("this is unicorn");
	}

	public Unicorn()
	{
		super();
	}
	
	public Unicorn(String brand, int maxspeed,int gear)
	{
		super();
		System.out.println("parameter const");
		this.gear=gear;
	}
	
	public static void main(String [] args)
	{
		
		Unicorn un = new Unicorn();
		un.changespeed();
		un.display();
		Unicorn un1 = new Unicorn("kingf",89,3);
		un1.display();
		
	}
	
}
