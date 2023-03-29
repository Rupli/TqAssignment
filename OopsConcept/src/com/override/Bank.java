package com.override;

public class Bank {

	protected float rateOfIntrest;

	public Bank() {

	}

	public Bank(float rateOfIntrest) {
		
		this.rateOfIntrest=rateOfIntrest;
   System.out.println("rate Of Intrest =9%");
	}
	
	public float getRateOfIntrest()
	{
	return rateOfIntrest;
	
	

}
}