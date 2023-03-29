package com.demo;

public class Car {
	
	private int modelNum;
	private String model;
	private String colour;
	private Driver driver;
	
	public Car()
	{
		
	}
	
	public Car( int modelNum,String model,String colour, Driver driver)
	{
		this.modelNum=modelNum;
		this.model=model;
		this.colour=colour;
		this.driver=driver;
	}

	public int getModelNum() {
		return modelNum;
	}

	public void setModelNum(int modelNum) 
	{
		this.modelNum = modelNum;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getColour() 
	{
		return colour;
	}

	public void setColour(String colour) 
	{
		this.colour = colour;
	}
	public Driver getDriver()
	{
		return driver;
	}
	public void setDriver(Driver driver)
	{
		this.driver=driver;
	}
	public String toString()
	{
		return "modelNum:"+ modelNum +  "model"+ model + "colour:"+ colour + "driver:"+ driver;
	}

}
