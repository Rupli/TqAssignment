package com.test4;

import java.util.Scanner;

public class Reversenum {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter num");
		int num= sc.nextInt();
		
		int reverse=0;
	    int rem;
		while(num!=0)
		{
			 rem=num%10;
			 reverse=(reverse*10)+rem;
			 num/=10;
			 
		}
			 System.out.println(reverse);
		
	   }
                 
		
	}


          