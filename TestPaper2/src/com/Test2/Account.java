package com.Test2;

public class Account 
{
int id;
long accountNum;
String panCard;
long debitCard;
float balance;

public Account()
{
	System.out.println("default constructer");
}
public Account(int id,long ac,String pan,long deb,float bal)
{
	System.out.println("paramter const 1");
	this.id=121;
	this.accountNum=9876543;
	this.panCard="YPM123";
	this.debitCard=123354;
	this.balance=55776.5f;
}
	
public String toString()
{
	return "Account details : " + id + " "+""+panCard+""+ ""+ balance;
}
}
