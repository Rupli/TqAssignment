package com.interfacee;

public class Person1 implements ShoppingMall
{
	String online;
	String payment;
	
	
	public Person1()
	{
		
	}
	public Person1(String online)
	{
		
		this.online=online;
		System.out.println("accept online mode");
	}
	public void payment()
	{
		
		
		System.out.println("payment done");
	}
	
	public String toString()
	 {
		 return "payment details:"+ " " + payment;
	 }
	public static void main(String [] args)
	{
		ShoppingMall s1= new Person1("online");
		s1.payment();
		System.out.println(s1);
	}
 }
