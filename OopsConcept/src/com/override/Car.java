package com.override;

 class Car extends Vehicle

{
	void accelerate(long mph)
	{
		this.mph=mph;
		
		System.out.println("child class");
	}
	
}



