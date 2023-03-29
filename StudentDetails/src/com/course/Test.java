package com.course;

import java.util.Scanner;

public class Test {
	

	public static void getDetails(Course  c1)
	{
	
		Scanner sc = new Scanner(System.in);
	
	
	System.out.println("enter course id");
	c1.setId(sc.nextInt());
	
	System.out.println("enter course name");
	c1.setName(sc.next());
	
	System.out.println("enter fees");
	c1.setFees(sc.nextFloat());
	}
	
//System.out.println("this is id:"+c1.getId() +""+ ""+"this is name :" + c1.getName() +""+ "" + ""+ "this is fees:" + c1.getFees());	
	
	public static void main(String[] args)
	{
   Course [] cr = new Course[4];
	for(int i=0;i<cr.length;i++)
	{
		cr[i]= new Course();
		
		
		
	}
	
	
}

	
}
