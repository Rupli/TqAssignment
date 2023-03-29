package com.polymorphism;

public class Kidd 
{
	int book;
	String author;
	float price;
	
	static void readbook()
	{
		
		System.out.println("read book");
	}
	
	static void readbook(int book,String author)
	{
		book=2;
		author="s.s sharma";
		System.out.println(book + author);
				
	}
	static void readbook(int book,String author,float price)
	{
		book=9;
		author="s.s ";
		price=99f;
		System.out.println(book + author + price);
				
	}
	
	public static void main (String [] args)
	{
		
		Kidd.readbook();
		Kidd.readbook(2, "thf");
	}


}
