package com.demo;

import java.util.Scanner;

public class TestCar {
	
	static Scanner sc = new Scanner(System.in);

	public static void method1(Car c)
	{
		System.out.println("enter modelnum");
		c.setModelNum(sc.nextInt());
		
		System.out.println("enter colour");
	     c.setColour(sc.next());
	     
	     System.out.println("enter model");
	     c.setModel(sc.next());
	
	     System.out.println("set driver");
	     c.setDriver(new Driver());
	     
	     System.out.println("licience");
	      c.getDriver() .setLicienceNum(sc.nextInt());
	      
	      System.out.println("driver name");
	      c.getDriver().setDName(sc.next());
	      
	      
	}
	
	public static void main(String [] args)
	{
		Car cr[] = new Car[4];
		
		
		for(int i=0;i<4;i++)
		{
			cr[i]=new Car();
			method1(cr[i]);
			System.out.println(cr[i]);
			
		}
	}
}
