package com.test4;

public class Exa12 extends Exam12
{
	
	static void display(int a)
	{
		System.out.println("overriding first method");
	}
	static void display(int a,int c,int d)
	{
		System.out.println("overriding secound method");
	}
	static void display(int a,int c,float e)
	{
		System.out.println("overriding third method");
		
	}
	static void display(int a,int d)
	{
		System.out.println("overriding last method");
	}
	
	public static void main (String [] args)
	
	{
		Exa12 ex = new Exa12();
		ex.display(65);
		
		ex.display(12, 10);
		
		
		
	}
	
	
	
	
	
	
	
	

}
