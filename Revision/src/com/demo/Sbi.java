package com.demo;

public class Sbi extends RbiBank
{
	public void rateofIntrest()
	{
		System.out.println("12%");
	}

	public void employee()
	{
		System.out.println("working in sbi");
	}
	
	
	
	public static void main(String[] args)
	{
		Sbi sb = new Sbi();
		sb.rateofIntrest();
		System.out.println(sb);
		
		sb.employee();
		System.out.println(sb);
	}
}
