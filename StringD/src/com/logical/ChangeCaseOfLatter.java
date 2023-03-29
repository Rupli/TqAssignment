package com.logical;

import java.util.Scanner;

public class ChangeCaseOfLatter 
{
	public static void covert(String str)
	{
		System.out.println(str=str.toLowerCase());
	}

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter string");
		
		String s =sc.next();
		
		covert(s);
		
	}
}
