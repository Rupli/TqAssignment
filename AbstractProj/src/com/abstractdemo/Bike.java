package com.abstractdemo;

public abstract class Bike {

	String brand;
	int maxspeed;
	
	abstract void changespeed();
	
	void display()
	{
		brand="honda";
		maxspeed=90;
		System.out.println(brand + maxspeed);
	}
	
	//can not creat object of 
	
}
