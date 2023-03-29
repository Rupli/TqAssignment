package com.demo;

import java.util.Scanner;

public class BookTest
{
	

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);

		Author ak1 = new Author();
		Book bk = new Book(1,"abc",66f,3,new Author(1,"qwe"));

		System.out.println("enter id");
		ak1.setId(sc.nextInt());
		
		System.out.println("enter name");
		ak1.setName(sc.next());
		
		

		System.out.println(bk);
	}

}
