package com.logical;

import java.util.Scanner;

public class UpperLetter 
{
	
	public static void conver(String str)
	{
		System.out.println(str=str.toUpperCase());
	}

	
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter string");
		
		String s = sc.next();
		
		conver(s);
	}
	
	
	
}
