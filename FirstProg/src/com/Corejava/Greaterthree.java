package com.Corejava;
import java.util.Scanner;
public class Greaterthree {
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);

	System.out.println("enter num");
	int num = sc.nextInt();
	
	for(int i=1;i<=num;i++)
	{
		if (num%10==0)
			num/=10;
		
			System.out.println(i);
	}
	
	
		
		
		
	}

}