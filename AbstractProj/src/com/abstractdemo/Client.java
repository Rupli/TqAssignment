package com.abstractdemo;

import java.util.Scanner;

public class Client extends Locker
{
	String bank;

	 void  details()
	 {
		 System.out.println("daitails of locker");
	 }
	
	 Client()
	 {
		 super();
	 }
	
	 Client(String bank)
	 {
		  super();
	 this.bank="HDFC";
	 System.out.println("bank details");
	 }
	
	 public static void main(String [] args)
	 {
		 Scanner sc=new Scanner(System.in);
		Locker cl = new Client("tgtg");
		
		 
		
	 }
	
	
	
	
	
	
	
}
