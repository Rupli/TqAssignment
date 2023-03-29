package com.enCapsulation;

public class Rectangle
{
	int length;
	int breadth;
	
	public void enterValue(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public float displayArea()
	{
	float area=length*breadth;
	return area;
	}
		
	public float displayPerimeter()
	{
	float perimeter= 2*(length+breadth);
	return perimeter;
	}
	public static void main(String args[])
	{
	Rectangle r1=new Rectangle();
	r1.enterValue(4,2);
	System.out.println("Area " +r1. displayArea());
	
	System.out.println("perimeter:" + r1.displayPerimeter());
	}
		
	}


