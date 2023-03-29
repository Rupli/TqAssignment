package com.midtestpractice;

public interface Rbi {
	
	public void carloan();
	
	public void goldloan();
	
	default void loan()
	{
		System.out.println("9.0 + rbi");
	}

}
