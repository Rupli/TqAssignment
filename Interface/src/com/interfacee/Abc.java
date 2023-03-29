package com.interfacee;

public class Abc implements Student 
{
	public void display()
	{
		System.out.println("in class employee");
	}
	
	public static void main (String[] args)
	{
		Abc a = new Abc();
		a.display();
	}
}
