package com.test4;

import java.util.Scanner;

// Write a program to count the frequency of digit in a number
public class FreqyofDigit 
{
	public static void main(String [] args)
	{
		int num,count,originalnum,digit;
		
	Scanner sc = new Scanner (System.in);	
	System.out.println("enter num");
	
	num=sc.nextInt();
	System.out.println("digit\tFrequency");
		
   for(int i =0;i<=9;i++)		
   {
	   count=0;
	   originalnum=num;
	   while(originalnum>0)
	   {
		  digit=originalnum%10;
		  if(digit==i) {
			  count++;
		  }
		  originalnum=originalnum/10;
		  
	   }
	   if(count>0)
	   {
		  System.out.println(i+ "t"+ count);  
	   }
	   
	   
	   
	   
	   
	   
	   
   }
		
		
		
		
		
		
		sc.close();
	}
	

}
