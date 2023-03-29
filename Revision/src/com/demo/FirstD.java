package com.demo;

 class One {

	public void getdetails()
	{
		System.out.println("class one getdetails");
	}
	
	
 }
	
 class Second extends One
 {
	 public void getdetails()
		{
			System.out.println("class Second getdetails");
		} 
 }
	
	 class Third extends One
	{
		
		 public void getdetails()
			{
				System.out.println("class Third getdetails");
			}
		
		}
	 //not support in java
	public class FirstD extends Second,Third
	{
		public static void main(String [] args)
		{
		Third th = new Third();
		// create ambiguaty 
		th.getdetails();
	}
}
}