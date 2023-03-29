package com.toString;

public class WithtoString {
	
	
		
		int rollno;
		String name;
		String city;
		
		public WithtoString(int rollno,String name,String city)
		{
			this.rollno=rollno;
			this.name=name;
			this.city=city;
			
		}
		
		public static void main (String []args)
		{
			WithtoString wt =new WithtoString(101 ," ruvi "," delhi ");
			WithtoString wt1=new WithtoString(112 ," abcd "," pune ");
			
			
			System.out.println(wt);
			System.out.println(wt1);
		}
			public String toString() {
			
				return  rollno+ name+ city;
				
				}
		

		}
	



