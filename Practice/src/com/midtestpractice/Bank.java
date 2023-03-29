package com.midtestpractice;

public interface Bank  extends Rbi{
	
	public void rateofintrest();
	
	default void loanrate()
	{
		System.out.println("7.9");
	}
	
	
	

}
