package com.enCapsulation;
import java.util.Scanner;
public class HDFC 
{
	public static void main (String args[])
	{
		BankAccount b1=new BankAccount();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter bankaccountid");
		b1.setAcid(sc.nextInt());
		
		System.out.println("enter name");
//	b1.setName(sc.next());
//		
//		System.out.println("enter balance");
//		 b1.setBalance(sc.nextLong());
		
		 System.out.println("Account Id:"+b1.getAcid());
	      
	       System.out.println("Name:"+b1.getName());
	       System.out.println("Balance:"+b1.getBalance());
		
		
	}
	

}
