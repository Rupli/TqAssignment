package com.polymorphism;

public class CircleMethodOverloading
{
	
		float radius;
		float pi;
		float area;
		static float area(float pi,float radius ,float rad)
		{
			
			float area=pi*radius*radius;
			return area; 
		}
		static void area(int length ,int breadth)
		{
		
		System.out.println("Area of rectangle is:"+(length*breadth));

		}
		static void area(float base, int height)
		{
			System.out.println("Area of triangle is:"+(0.5*base*height));
		}
	
	public static void main(String args[])
	{
		System.out.println(CircleMethodOverloading.area(3.14f,3.0f,3.0f));
		
		
	   CircleMethodOverloading.area(2,2);
	   CircleMethodOverloading.area( 5,4 );
	
	}
		

}
