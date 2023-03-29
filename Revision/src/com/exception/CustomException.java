package com.exception;

import java.util.Scanner;

public class CustomException {

	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			System.out.println("enter age");
			int age = sc.nextInt();
			

			
			try
			{
			  if(age<18)
			  {
				try
				{
				  if(age<0)
				  {
					  throw new InvalidAgeException("Age should be greater than zero");
				  }
				  throw new VoteAgeException("You cannot vote");
				
				}
				catch(InvalidAgeException e)
				{
					System.out.println(e);
				}
			  }
			  
			 
			}
			catch(VoteAgeException e)
			{
				System.out.println(e);
			}
			
			System.out.println("Final code");
		}
	}


