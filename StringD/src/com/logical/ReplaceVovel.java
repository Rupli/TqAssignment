package com.logical;

import java.util.Scanner;

public class ReplaceVovel 
{
	public static void vovelr(String str)
	{
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			
			if ((str.charAt(i) == 'a') ||( str.charAt(i)=='e') || (str.charAt(i)=='i')|| (str.charAt(i)=='o')|| (str.charAt(i)=='u'))
				{
				str=str.replace(str.charAt(i), '@');
				
			}
		}
		System.out.println(str);
	}
	
	public static void main (String [] args)
	{
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("enter string ");
//		
//		String s= sc.next();
		String s="java is programming lang";
		vovelr(s);
		
	}

}
