package com.midtestpractice;

import java.util.Scanner;



public class BookUserTest {
	
	static Scanner sc = new Scanner(System.in);
		
	public static void getdetails(Book bk)
	{
		System.out.println("enter id");
		bk.setBid(sc.nextInt());
		
		System.out.println("enter name");
		bk.setName(sc.next());
		
		System.out.println("enter prize");
		bk.setPrice(sc.nextFloat());
		
		System.out.println("enter author");
	     bk.setAuthor(new Author());
		
	     System.out.println("id");
	     bk.getAuthor() .setAid(sc.nextInt());
	     
	     System.out.println("author name");
	     bk.getAuthor(). setAname(sc.next());
	}
		public static void main(String [] args)
		{
			
			Book[] b1= new Book[4];
			
			for(int i=0;i<4;i++)
			{
				b1[i]= new Book();
				System.out.println(b1[i]);
				getdetails(b1[i]);
				
				
				
			}
			
			
		}
		
		
	
		
		
		
		
	

}
