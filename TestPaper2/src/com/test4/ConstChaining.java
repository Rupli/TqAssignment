package com.test4;

public class ConstChaining 
{
  int a;
  String name;
  float price;
  
  
	public ConstChaining(int a)
	{
		this.a=a;
	}
	public ConstChaining(int a,String name)
	{
		this(a);
		this.name=name;
	}
	public ConstChaining(int a,String name,float price  )
	{
		this(a,name);
		this.price=price;
	}
		  public static void main (String args[])  
		{
		ConstChaining c = new ConstChaining(1,"rupali",12f);
		System.out.println( "id" + c.a + "name" + c.name  + "price" + c.price );
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	


