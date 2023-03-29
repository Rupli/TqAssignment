package com.Corejava;
import java.util.Scanner;
public class ProductOfDigit {

	public static void main(String[] args) {
		int mul=1;
		int rem,q;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter num");
		int num=sc.nextInt();
		
		 
		while(num!=0)
		{
			
			 rem=num%10;
			q=num/10;
			mul=mul*rem;
		}
		System.out.println(mul);
			
		}
	}


