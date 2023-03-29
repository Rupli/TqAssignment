package com.demo;

public class Driver {

	private long licienceNum;
	private String dName;
	
	
	public Driver()
	{
		super();
	}
	
	public Driver(long licienceNum,String dName)
	{
		this.licienceNum=licienceNum;
		this.dName=dName;
		
	}
	
	public void setLicienceNum(long licienceNum)
	{
		this.licienceNum=licienceNum;
	}
	
	public long getLicienceNum()
	{
		return licienceNum;
	}
	
	public void setDName(String dName)
	{
		this.dName=dName;
	}
	
	public String getDName()
	{
		return dName;
	}
	
	public String toString()
	{
		return "licienceNum"+ licienceNum + "driver name:"+dName;
		
	}
	
}
