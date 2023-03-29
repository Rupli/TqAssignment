package com.demo;

public class Area {

	float radius;
	float pi;
	double area;
	int length;
	int breadth;
	static float arear(float radius,float pi,float rad)
	{
	float area= pi*radius*radius;
		return area;
	}
	
	static void rectangle(int length,int breadth)
	{
		System.out.println(length*breadth);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	
		System.out.println(Area.arear(3.14f, 2, 2));
		
		Area.rectangle(2, 3);

	}

}
