package com.Corejava;
//year%400 && year %4 and year %100  

import java.util.Scanner;

public class LeapYear 

{
	
	public static void main(String args[])
	
	{

Scanner sc = new Scanner(System.in);

System.out.println("enter the year");

int year = sc.nextInt();

if((year% 400==0) ||  ((year %4==0) &&  (year %100!= 0 )))
	
{ 

	System.out.println( year + " :is a leap year");
	
	

}
	 


}
	
}	