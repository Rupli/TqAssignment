package com.SwitchStatemment;

import java.util.Scanner;

public class TotalDays

{
	
		
		public static void main (String args[])
		
		{

		Scanner sc = new Scanner(System.in);

		System.out.println ("enter days");
		
		int days =sc.nextInt();
		
		switch(days) {
		
		case 1:System.out.println("january 31 days");
		
		break;
		
		case 2:System.out.println("Feb 28 days");
		
		break;
		
		case 3:System.out.println("march 31 days");
		
		break;
		
		case 4:System.out.println("April 30 days");
		
		break;
		
		case 5:System.out.println("May 31 days");
		
		break;
		
		case 6:System.out.println("june 30 days");
		
		break;
		
		case 7:System.out.println("july 31 days");
		
		break;
		
		case 8:System.out.println("August 31 days");
		
		break;
		
		case 9:System.out.println("Sep 30 days");
		
		break;
		
		case 10:System.out.println("Oct 31 days");
		
		break;
		
		case 11:System.out.println("November 30 days");
		
		break;
		
		case 12:System.out.println("december 31 days");
		
		break;
		
		default :System.out.println("invalid input");
		
		}	

}

}