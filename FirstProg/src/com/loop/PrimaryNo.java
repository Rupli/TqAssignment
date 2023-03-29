package com.loop;

import java.util.Scanner;

public class PrimaryNo 
{
public static void main(String args[])
{
// divide by 1 and itself

Scanner sc=new Scanner(System.in);
System.out.println("enter num");
int num=sc.nextInt();

boolean flag=true;
if (num==0||num==1)
System.out.println(num+"this is not prime number");

else {
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			
			System.out.println(num+" is not a prime number");
			flag=false;
			break; // to come out of for loop
		}
	}

if(flag) // flag==true

{
	System.out.println(num+" is a prime number");
}

sc.close();
	
} 

	
	
	
	
}
}