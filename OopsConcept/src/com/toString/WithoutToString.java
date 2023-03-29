package com.toString;

public class WithoutToString {
	
	int rollno;
	String name;
	String city;
	
	public WithoutToString(int rollno,String name,String city)
	{
		this.rollno=rollno;
		this.name=name;
		this.city=city;
		
	}
	
	public static void main (String []args)
	{
		WithoutToString wt =new WithoutToString(101,"ruvi","delhi");//obj creat
		WithoutToString wt1=new WithoutToString(112,"abcd","pune");
		
		System.out.println(wt);
		System.out.println(wt);

	}
	

}
