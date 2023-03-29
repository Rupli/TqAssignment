package com.midtestpractice;

public class ConcrentC extends A
{
	
		public void bag()
		{
			
			System.out.println("iofhqhi");
		}
	
		public void gift()
		{
			super.gift();
			System.out.println("watch");
		}
		public static void main (String [] args)
		{
			
			ConcrentC cs= new ConcrentC();
			cs.bag();
			cs.gift();
			
		
	}

}
