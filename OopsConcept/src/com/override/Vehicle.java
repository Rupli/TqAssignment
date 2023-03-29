package com.override;
//create class Vehicle with methods accelerate(long mph) with long type parameter ,stop(),run() 

//all method return string type of value.
//Create class car which extends Vehicle implement accelerate(long mph)differently in car class.

public class Vehicle {

	long run;
	long stop;
	long mph;
	
	void accelerate(long mph)
	{
		this.mph=mph;
		
		System.out.println("base vehical class");
	}
	

}
