package com.abstractdemo;

public abstract class Closet 
{
	float door;
	float space;
	float length;
	
   	abstract void show();
	
    	Closet()
    	{
    		
    	}
    	Closet(float length)
    	{
    		this.length=length;
    		System.out.println("length of closet");
    	}

		
		public String toString() {
			return "Closet door=" + door + ", space=" + space + ", length=" + length + "";
		}
    	
    	

}
