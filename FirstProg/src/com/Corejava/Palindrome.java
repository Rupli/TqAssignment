package com.Corejava;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		
		int originalnum=num;
		int reverse=0;
		int rem;
		
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			 num/=10;
			
			
		}
		
 if(originalnum==reverse) {
	 System.out.println("num is palidrome");
 }
 else {
	 System.out.println("num is not palindrome");
 }
	}

}
