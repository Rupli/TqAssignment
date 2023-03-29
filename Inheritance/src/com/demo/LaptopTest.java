package com.demo;

public class LaptopTest extends Laptop
{

	public static void main(String[] args)
	{
		Laptop l1 = new Laptop();	
		
		l1.setNoOfUSBPort(4);
		
		System.out.println(l1.getNoOfUSBPort());

		l1.setProcessorSpeed(90);
		
		System.out.println(l1.getProcessorSpeed());
	}

}
