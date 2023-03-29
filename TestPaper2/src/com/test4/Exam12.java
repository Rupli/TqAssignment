package com.test4;
//Write a program to overload and override static method
public class Exam12 
{
	int a=1;
	long b=2;
	int c=3;
	int d=4;
	float e=5f;
	
	static void display(int a)
	{
		System.out.println("first method");
	}
	static void display(int a,int c,int d)
	{
		System.out.println("secound method");
	}
	static void display(int a,int c,float e)
	{
		System.out.println("third method");
		
	}
	static void display(int a,int d)
	{
		System.out.println("last method");
	}
	
	public static void main(String [] args)
	{
		Exam12.display(2);
		Exam12.display(8, 10);
		Exam12.display(7, 0, 0);

}
}