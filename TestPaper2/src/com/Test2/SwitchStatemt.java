package com.Test2;
import java.util.Scanner;
public class SwitchStatemt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your chioce of country :");
 char ch=sc.next().charAt(0);
		switch(ch) 
		{
		case 'i':
		System.out.println("India");
		System.out.println("Capital : New Delhi");
		System.out.println("Pincode : 414203");
		break;
		case 'a':
			System.out.println("Australia");
			System.out.println("Capital :  Delhi");
			System.out.println("Pincode : 4203");
			break;
			default:System.out.println("wrong user input");
	}

	}
}
