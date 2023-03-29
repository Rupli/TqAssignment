package com.abstractdemo;

public abstract class Bank {

	float rateofIntrest;

	abstract void  getRateofIntrest();
	
	 void display()
	{
	  System.out.println("Bank details:");  	
	}
	
	public Bank()
	{
		
	}
	public Bank(float rateofIntrest)
	{
		this.rateofIntrest=rateofIntrest;
	}

	public void setRateofIntrest(float rateofIntrest) {
		this.rateofIntrest = rateofIntrest;
	}
	
	
}
