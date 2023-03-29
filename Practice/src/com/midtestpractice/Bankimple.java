package com.midtestpractice;

public class Bankimple implements Bank, Rbi {

	public void rateofintrest() {
		System.out.println("8.9");
	}

	public void carloan()
	{
		System.out.println("3.7");
	}

	public void goldloan()
	{
		System.out.println("6.6");
	}
	
	public void loan()
	{
		
		
	}
	
	public static void main(String [] args)
	{
		Bankimple b = new Bankimple();
		b.carloan();
		
	}

}
